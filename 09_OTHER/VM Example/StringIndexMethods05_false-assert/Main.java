/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/jbmc-strings/StringIndexMethods05
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main
{
   public static void main(String[] args)
   {
      if(args.length < 1 || args[0] == null)
        return;

      String letters = args[0];
      assert letters.lastIndexOf("diffblue", 25)==1;
   }
}
