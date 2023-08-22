import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String filecontent = "package com.github.rkumsher.number;\n" +
                "\n" +
                "import static com.google.common.base.Preconditions.*;\n" +
                "\n" +
                "import java.util.Random;\n" +
                "\n" +
                "/**\n" +
                " * Utility library to return random numbers. Unlike Apaches RandomUtils, this supports negative\n" +
                " * numbers.\n" +
                " */\n" +
                "public class RandomNumberUtils {\n" +
                "\n" +
                "  private static final Random RANDOM = new Random();\n" +
                "\n" +
                "  private RandomNumberUtils() {}\n" +
                "\n" +
                "  /**\n" +
                "   * Returns a random int which may be positive, negative, or zero.\n" +
                "   *\n" +
                "   * @return the random int\n" +
                "   */\n" +
                "  public static int randomInt() {\n" +
                "    return randomInt(Integer.MIN_VALUE, Integer.MAX_VALUE);\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Returns a random int which will be positive.\n" +
                "   *\n" +
                "   * @return the random int\n" +
                "   */\n" +
                "  public static int randomPositiveInt() {\n" +
                "    return randomInt(1, Integer.MAX_VALUE);\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Returns a random int which will be negative.\n" +
                "   *\n" +
                "   * @return the random int\n" +
                "   */\n" +
                "  public static int randomNegativeInt() {\n" +
                "    return randomInt(Integer.MIN_VALUE, 0);\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Returns a random int within the specified range.\n" +
                "   *\n" +
                "   * @param startInclusive the earliest int that can be returned\n" +
                "   * @param endExclusive the upper bound (not included)\n" +
                "   * @return the random int\n" +
                "   * @throws IllegalArgumentException if endExclusive is less than startInclusive\n" +
                "   */\n" +
                "  public static int randomInt(int startInclusive, int endExclusive) {\n" +
                "    checkArgument(startInclusive <= endExclusive, \"End must be greater than or equal to start\");\n" +
                "    if (startInclusive == endExclusive) {\n" +
                "      return startInclusive;\n" +
                "    }\n" +
                "    return RANDOM.ints(1, startInclusive, endExclusive).sum();\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Returns a random int that is greater than the given int.\n" +
                "   *\n" +
                "   * @param minExclusive the value that returned int must be greater than\n" +
                "   * @return the random int\n" +
                "   * @throws IllegalArgumentException if minExclusive is greater than or equal to {@link\n" +
                "   *     Integer#MAX_VALUE}\n" +
                "   */\n" +
                "  public static int randomIntGreaterThan(int minExclusive) {\n" +
                "    checkArgument(\n" +
                "        minExclusive < Integer.MAX_VALUE, \"Cannot produce int greater than %s\", Integer.MAX_VALUE);\n" +
                "    return randomInt(minExclusive + 1, Integer.MAX_VALUE);\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Returns a random int that is less than the given int.\n" +
                "   *\n" +
                "   * @param maxExclusive the value that returned int must be less than\n" +
                "   * @return the random int\n" +
                "   * @throws IllegalArgumentException if maxExclusive is less than or equal to {@link\n" +
                "   *     Integer#MIN_VALUE}\n" +
                "   */\n" +
                "  public static int randomIntLessThan(int maxExclusive) {\n" +
                "    checkArgument(\n" +
                "        maxExclusive > Integer.MIN_VALUE, \"Cannot produce int less than %s\", Integer.MIN_VALUE);\n" +
                "    return randomInt(Integer.MIN_VALUE, maxExclusive);\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Returns a random long which may be positive, negative, or zero.\n" +
                "   *\n" +
                "   * @return the random long\n" +
                "   */\n" +
                "  public static long randomLong() {\n" +
                "    return randomLong(Long.MIN_VALUE, Long.MAX_VALUE);\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Returns a random long which will be positive.\n" +
                "   *\n" +
                "   * @return the random long\n" +
                "   */\n" +
                "  public static long randomPositiveLong() {\n" +
                "    return randomLong(1, Long.MAX_VALUE);\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Returns a random long which will be negative.\n" +
                "   *\n" +
                "   * @return the random long\n" +
                "   */\n" +
                "  public static long randomNegativeLong() {\n" +
                "    return randomLong(Long.MIN_VALUE, 0);\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Returns a random long within the specified range.\n" +
                "   *\n" +
                "   * @param startInclusive the earliest long that can be returned\n" +
                "   * @param endExclusive the upper bound (not included)\n" +
                "   * @return the random long\n" +
                "   * @throws IllegalArgumentException if endExclusive is less than startInclusive\n" +
                "   */\n" +
                "  public static long randomLong(long startInclusive, long endExclusive) {\n" +
                "    checkArgument(startInclusive <= endExclusive, \"End must be greater than or equal to start\");\n" +
                "    if (startInclusive == endExclusive) {\n" +
                "      return startInclusive;\n" +
                "    }\n" +
                "    return RANDOM.longs(1, startInclusive, endExclusive).sum();\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Returns a random long that is greater than the given long.\n" +
                "   *\n" +
                "   * @param minExclusive the value that returned long must be greater than\n" +
                "   * @return the random long\n" +
                "   * @throws IllegalArgumentException if minExclusive is greater than or equal to {@link\n" +
                "   *     Long#MAX_VALUE}\n" +
                "   */\n" +
                "  public static long randomLongGreaterThan(long minExclusive) {\n" +
                "    checkArgument(\n" +
                "        minExclusive < Long.MAX_VALUE, \"Cannot produce long greater than %s\", Long.MAX_VALUE);\n" +
                "    return randomLong(minExclusive + 1, Long.MAX_VALUE);\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Returns a random long that is less than the given long.\n" +
                "   *\n" +
                "   * @param maxExclusive the value that returned long must be less than\n" +
                "   * @return the random long\n" +
                "   * @throws IllegalArgumentException if maxExclusive is less than or equal to {@link\n" +
                "   *     Long#MIN_VALUE}\n" +
                "   */\n" +
                "  public static long randomLongLessThan(long maxExclusive) {\n" +
                "    checkArgument(\n" +
                "        maxExclusive > Long.MIN_VALUE, \"Cannot produce long less than %s\", Long.MIN_VALUE);\n" +
                "    return randomLong(Long.MIN_VALUE, maxExclusive);\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Returns a random double which may be positive, negative, or zero.\n" +
                "   *\n" +
                "   * @return the random double\n" +
                "   */\n" +
                "  public static double randomDouble() {\n" +
                "    return randomDouble(-Double.MAX_VALUE, Double.MAX_VALUE);\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Returns a random double which will be positive.\n" +
                "   *\n" +
                "   * @return the random double\n" +
                "   */\n" +
                "  public static double randomPositiveDouble() {\n" +
                "    return randomDouble(1, Double.MAX_VALUE);\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Returns a random double which will be negative.\n" +
                "   *\n" +
                "   * @return the random double\n" +
                "   */\n" +
                "  public static double randomNegativeDouble() {\n" +
                "    return randomDouble(-Double.MAX_VALUE, 0);\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Returns a random double within the specified range.\n" +
                "   *\n" +
                "   * @param startInclusive the earliest double that can be returned\n" +
                "   * @param endExclusive the upper bound (not included)\n" +
                "   * @return the random double\n" +
                "   * @throws IllegalArgumentException if endExclusive is less than startInclusive\n" +
                "   */\n" +
                "  public static double randomDouble(double startInclusive, double endExclusive) {\n" +
                "    checkArgument(startInclusive <= endExclusive, \"End must be greater than or equal to start\");\n" +
                "    if (startInclusive == endExclusive) {\n" +
                "      return startInclusive;\n" +
                "    }\n" +
                "    return RANDOM.doubles(1, startInclusive, endExclusive).sum();\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Returns a random double that is greater than the given double.\n" +
                "   *\n" +
                "   * @param minExclusive the value that returned double must be greater than\n" +
                "   * @return the random double\n" +
                "   * @throws IllegalArgumentException if minExclusive is greater than or equal to {@link\n" +
                "   *     Double#MAX_VALUE}\n" +
                "   */\n" +
                "  public static double randomDoubleGreaterThan(double minExclusive) {\n" +
                "    checkArgument(\n" +
                "        minExclusive < Double.MAX_VALUE, \"Cannot produce double greater than %s\", Double.MAX_VALUE);\n" +
                "    return randomDouble(minExclusive + 1, Double.MAX_VALUE);\n" +
                "  }\n" +
                "\n" +
                "  /**\n" +
                "   * Returns a random double that is less than the given double.\n" +
                "   *\n" +
                "   * @param maxExclusive the value that returned double must be less than\n" +
                "   * @return the random double\n" +
                "   * @throws IllegalArgumentException if maxExclusive is less than or equal to negative {@link\n" +
                "   *     Double#MAX_VALUE}\n" +
                "   */\n" +
                "  public static double randomDoubleLessThan(double maxExclusive) {\n" +
                "    checkArgument(\n" +
                "        maxExclusive > -Double.MAX_VALUE, \"Cannot produce double less than %s\", -Double.MAX_VALUE);\n" +
                "    return randomDouble(-Double.MAX_VALUE, maxExclusive);\n" +
                "  }\n" +
                "}";

        String test = "  public static ZonedDateTime randomZonedDateTime(\n" +
                "    ZonedDateTime startInclusive, ZonedDateTime endExclusive)";
        test = test.trim();
        String[] tmp = test.split(" ");
        //for (String r : tmp) System.out.print(r + " ");
        //System.out.println(tmp.length);
        List<String> res = Week10.getAllFunctions(filecontent);
        for (String str : res) {
            System.out.println(str + ", ");
        }






    }
}