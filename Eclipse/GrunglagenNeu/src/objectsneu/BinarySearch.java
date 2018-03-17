package objectsneu;
class BinarySearch
{
  //Index des gesuchten Elementes mit binaeren Suche finden
  static int findElement (int[] field,int element )
  {
    int left = 0;
    int right = field.length - 1;
    int middle = 0;
    boolean isFound = false;

    while (!isFound && (left <= right))
    {
      middle = (left + right) / 2;

      if (field[middle] == element)
        isFound = true;
      else
      {
        if (field[middle] > element)
          right = middle -1;
        else
          left = middle + 1;
       }
    }

    if (isFound)
      return middle;
    else
      return -1;
  }

  public static void main(String[] args)
  {
    //eindimsensionales Array mit 22 Elemenen initialisieren
    int[] numbers = {2, 3, 6, 10, 11, 13, 16, 18, 22, 23, 25, 27, 29, 30, 34, 35, 36, 38, 39, 44, 47, 49};
    System.out.println("Index des gesuchten Elementes: "+ findElement(numbers,44));
  }
}
