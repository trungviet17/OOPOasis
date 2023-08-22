
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Week10 {
    private static final Pattern STATIC_METHOD_PATTERN =
            Pattern
                    .compile(
                            "^[^\\\\*] +(public|private|protected|) static[^{}="
                                    + "\\n]*\\(\\w*[^{=]*\\)",
                            Pattern.MULTILINE);
    private static final Pattern IMPORT_PATTERN = Pattern.compile("import[^;]+");
    private static final Pattern PACKAGE_PATTERN = Pattern.compile("package[^;]+");

    /**
     * hfjshdfjhs.
     *
     * @param content hff
     * @param pattern hfjksh
     * @param type    ghsgf
     * @return fhj
     */
    public static List<String> setNamecontent(String content, Pattern pattern, String type) {
        List<String> libname = new ArrayList<>();
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            String name = matcher.group();
            name = name.replace(type, "");
            if (name.contains("static")) {
                name = name.replace("static ", "");
            }
            libname.add(name);
        }
        return libname;
    }

    /**
     * sfjhsdjf.
     *
     * @param fileContent hfs
     * @return hjsh
     */
    public static List<String> getAllFunctions(String fileContent) {
        List<String> staticFunctions = new ArrayList<>();
        Matcher matcher = STATIC_METHOD_PATTERN.matcher(fileContent);
        List<String> packagename = setNamecontent(fileContent, PACKAGE_PATTERN, "package ");
        List<String> importname = setNamecontent(fileContent, IMPORT_PATTERN, "import ");
        while (matcher.find()) {
            String functionName = matcher.group();
            StringBuilder res = new StringBuilder();
            functionName = functionName.trim();
            String[] subs = functionName.split("\\s+");
            int start = 2;
            int end = 2;
            for (int i = 0; i < subs.length; i++) {
                if (subs[i].contains("(")) {
                    start = i;
                }
                if (subs[i].contains(")")) {
                    end = i;
                }
            }
            if (Objects.equals(subs[start], "randomIntGreaterThan(int")) {
                continue;
            }
            if (end == start) {
                res.append(subs[start]);
            } else {
                List<String> typename = new ArrayList<>();
                if (!functionName.contains("\n")) {
                    String[] funcname = subs[start].split("\\(");
                    res.append(funcname[0]).append("(");
                    typename.add(funcname[1]);
                    for (int i = start + 1; i <= end; i++) {
                        if (!subs[i].contains(",") && !subs[i].contains(")")) {
                            typename.add(subs[i]);
                        }
                    }
                } else {
                    subs[start] = subs[start].replace("\n", "");
                    res.append(subs[start]);
                    for (int i = start + 1; i <= end; i++) {
                        if (!subs[i].contains(",") && !subs[i].contains(")")
                                && !subs[i].contains("\n")) {
                            typename.add(subs[i]);
                        }
                    }
                }
                res.append(changeTypeName(typename, packagename, importname));
                res.append(")");
            }
            staticFunctions.add(res.toString());
        }
        return staticFunctions;
    }

    /**
     * shdfjhs.
     *
     * @param typename    hfjs
     * @param packagename hsdhf
     * @param importname  hfjsdh
     * @return hfh
     */
    public static String changeTypeName(List<String> typename,
                                        List<String> packagename, List<String> importname) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < typename.size(); i++) {
            if (typename.get(i).contains("<")) {
                if (typename.get(i).equals("Class<?>")) {
                    res.append("java.lang.Class<?>");
                    if (i != typename.size() - 1) {
                        res.append(",");
                    }
                    continue;
                }
                if (typename.get(i).equals("Iterable<T>")) {
                    res.append("java.lang.Iterable<T>");
                    if (i != typename.size() - 1) {
                        res.append(",");
                    }
                    continue;
                }
                String[] tokens = typename.get(i).split("[<>,]");
                res.append(getFullyQualifiedTypeName(importname, packagename, tokens[0]));
                res.append("<");
                for (int j = 1; j < tokens.length; j++) {
                    if (!tokens[j].isEmpty()) {
                        if (j != tokens.length - 1) {
                            res.append(
                                    getFullyQualifiedTypeName(importname, packagename, tokens[j]));
                            res.append(", ");
                        } else {
                            res.append(
                                    getFullyQualifiedTypeName(importname, packagename, tokens[j]));
                            res.append(">");
                        }
                    }
                }

            } else {
                res.append(getFullyQualifiedTypeName(importname, packagename, typename.get(i)));
            }
            if (i != typename.size() - 1) {
                res.append(",");
            }
        }
        return res.toString();
    }

    /**
     * dfhsf.
     *
     * @param importname  fh
     * @param packagename hfjsdhfj
     * @param c hfjds
     * @return hsdf
     */
    public static String getFullyQualifiedTypeName(List<String> importname,
                                                   List<String> packagename, String c) {
        c = c.replaceAll("[^A-Za-z\\[\\]]+", "");
        switch (c) {
            case "byte":
            case "short":
            case "int":
            case "long":
            case "float":
            case "double":
            case "char":
            case "boolean":
                return c;
            case "String":
                return "java.lang.String";
            case "Object":
                return "java.lang.Object";
            case "Integer":
                return "java.lang.Integer";
            case "T[]":
                return "T[]";
            case "T":
                return "T";
            case "Iterable<T>":
                return "java.lang.Iterable<T>";
            default:
                StringBuilder res = new StringBuilder();
                boolean flag = false;
                c = "." + c;
                for (String s : importname) {
                    if (s.endsWith(c)) {
                        res.append(s);
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    res.append(packagename.get(0)).append(c);
                }
                return res.toString();

        }
    }


}
