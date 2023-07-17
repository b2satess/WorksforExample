import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int oldestAge = 0;
    int sumAge = 0;
    System.out.println("何人分の情報を入力しますか：");
     int count = scanner.nextInt();
     for (int i = 0; i < count; i++) {
    System.out.println( (i + 1) + "人目");
    System.out.println("名前：");
    String firstName = scanner.next();
    System.out.println("名字：");
    String lastName = scanner.next();
    System.out.println("年齢：");
    int age = scanner.nextInt();
    if(oldestAge < age){
      oldestAge = age;
    }
    sumAge = age + sumAge;
    System.out.println("身長(m)：");
    double height = scanner.nextDouble();
    System.out.println("体重(kg)：");
    double weight = scanner.nextDouble();
    
    Person.printData(firstName,lastName,age,height,weight);
    }
    System.out.println("最高年齢は"+ oldestAge +"歳です");
    System.out.println("平均年齢は"+ (int)(sumAge/count)+"歳です");
  }
}
