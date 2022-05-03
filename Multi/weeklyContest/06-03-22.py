class Solution:
	def integerToRoman(self, num: int) -> str:
        Ts = ["", "M", "MM", "MMM", ]
        Hs = ["", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCC", "CM"]
        Tes = ["", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"]
        Ons = ["", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"]

        ans = ""
        ans += Ts[(num % 1000)]
        ans += Hs[(num//1000) % 100]
        ans += Tes[(num//100) % 10]
        ans += Ons[(num % 10)]

        return ans
