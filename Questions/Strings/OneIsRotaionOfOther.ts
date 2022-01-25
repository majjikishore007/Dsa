/**Input

s1="ABCD"
s2="CDAB"

The idea is simple join the s2 twice and find the s1 in s2 

two pointer approach
*/
function checkRotation(s1: string, s2: string): boolean {
  let res: string = s2 + s2;

  for (let i: number = 0; i < s2.length && i + s1.length < s2.length; i++) {
    if (s1.charAt(i) === s2.charAt(i)) {
      //check for the sub string
      if (s2.substring(i, i + s1.length) === s1) {
        return true;
      }
    }
  }

  return false;
}
