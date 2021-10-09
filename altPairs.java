/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
*/


public String altPairs(String str) {
  String newString = "";
  for (int i = 0; i < str.length(); i +=4) {
    if (i != str.length()-1) {
      newString += str.substring(i,i+2);
    } else {
      newString += str.charAt(i);
    }
  }
  return newString;
}
