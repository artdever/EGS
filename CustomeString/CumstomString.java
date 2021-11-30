package CustomeString;

public final class CumstomString {
  private final char [] string;

  // Default constructor CumstomString
  public CumstomString () {
    this.string = new char[0];
  }
  // Constructor CumstomString
  public CumstomString (char  string[]) {
    if (string == null)
      this.string = null;
    else {
      this.string = new char[string.length];
      System.arraycopy(string,0,this.string,0,string.length);
//      this.string = string.clone();
    }

  }
  // Copy constructor CumstomString
  public CumstomString (CumstomString cumstomString) {
    this.string = cumstomString.string.clone();
  }

  // Print string
  public void printCustomString () {
    for (char element : string) {
      System.out.print(element);
    }
    System.out.println();
  }

  // The method converts different types of values into CustomString.
  public static CumstomString valueOf(Object obj) {
    return (obj == null) ? new CumstomString("null".toCharArray()) : new CumstomString(obj.toString().toCharArray());
  }

  //The method returns the character at the specified index in a CustomString.
  public char charAt (int index) {
    return string[index];
  }

  // The method returns the index within this string of the first occurrence of the specified character.
  // If no such character occurs in this string, then -1 is returned.
  public int indexOf (char ch) {
    int index = 0;

    if (string.length == 0 || string == null)
      return -1;

    while (string[index++] != ch && index < string.length);

    if (string.length == index && string[index - 1] != ch)
      return -1;
    else
      return --index;
  }

  // The method returns true if and only if this string contains the specified sequence of char values.
  public boolean	contains (CumstomString charSequence) {
    if (charSequence.string.length > string.length)
      return false;

    for (int i = 0; i < string.length - charSequence.string.length; i++) {
      if (string[i] == charSequence.charAt(0)){
        int count = 1;
        // Check the other characters are the same?
        while (string[count++] == charSequence.charAt(count++));

        if (count == charSequence.string.length)
          return true;
        else
          return false;
      }
    }
    return  false;
  }

  // The method returns a CustomString that is a substring of this CustomString.
  public CumstomString subCustomString (int beginIndex, int endIndex) {
    if (beginIndex == endIndex && endIndex < string.length && beginIndex >= 0)
      return new CumstomString(new char[0]);
    else if (endIndex > beginIndex && beginIndex >= 0 && endIndex < string.length){

      char [] ch = new char[endIndex - beginIndex];
      for (int i = beginIndex, j = 0; i < endIndex; i++)
        ch[j++] = string[i];

      return new CumstomString(ch);
    }
    else
      throw new IndexOutOfBoundsException("Out of bounds!");
  }

  // The method returns a length
  public int length() {
    return string.length;
  }

  // The method returns a true if string is empty
  public boolean isEmpty() {
    return string.length > 0 ? false : true;
  }

  // The method returns a CustomString whose value is this CustomString,
  // with all leading and trailing space removed
  public CumstomString trim() {
    if (string[0] != ' ' && string[string.length-1] != ' ')
      return this;
    else {
      int beginIndex = 0;
      int endIndex = string.length - 1;
      while (string[beginIndex] == ' ')
        beginIndex++;
      while (string[endIndex] == ' ')
        endIndex--;
      char [] ch = new char[endIndex - beginIndex + 1];
      for (int i = beginIndex, j = 0; i < endIndex + 1; i++) {
        ch[j++] = string[i];
      }
      return new CumstomString(ch);
    }
  }

}
