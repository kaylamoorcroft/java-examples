public class People
{
  public static void main(String args[])
  {
    Person person = new Person("Astril", "Anderson", 42, 110000);
    LuckyPerson luckyPerson = new LuckyPerson("Lucifer", "Fitzgerald", 10000, 52830, 99);
    TwoJobPerson twoJobPerson = new TwoJobPerson("Chuuya", "Dostoevsky", 33, 19998, 2);
    // Blade helped me come up with these names :)
    
    System.out.println("Before raises:");
    System.out.println(person);
    System.out.println(luckyPerson);
    System.out.println(twoJobPerson);
    
    person.giveRaise();
    luckyPerson.giveRaise();
    twoJobPerson.giveRaise();
    twoJobPerson.giveSecondRaise();
    
    System.out.println("\nAfter raises:");
    System.out.println(person);
    System.out.println(luckyPerson);
    System.out.println(twoJobPerson);
  }
}