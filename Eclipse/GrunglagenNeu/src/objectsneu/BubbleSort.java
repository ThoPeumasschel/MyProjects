package objectsneu;
class BubbleSort
{
  static void bubbleSort (int[] field)
  {
    int temp = 0;

    for (int i = field.length - 1; i>= 0; i--)
    {
      for (int j = 0; j <= i-1; j++)
      {
        if (field[j] > field[j + 1])
        {
          temp = field[j];
          field[j] = field[j + 1];
          field[j + 1] = temp;
        }
      }
    }
  }

  public static void main(String[] args)
  {
    //eindimsensionales Array mit 6 Elemenen initialisieren
    int[] numbers = {5, 3, 1, 10, 2, 0};

    //Elemente des Arrays werden sortiert
    bubbleSort(numbers);

    System.out.println("Sortierte Elemente: ");
    for (int i = 0; i < numbers.length; i++)
      {
        System.out.print(numbers[i]+" - ");
      }

  }
}
