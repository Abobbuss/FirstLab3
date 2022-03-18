// 1 лаба
/*
class Date{ // тут берутся рандомные параметры для людей
    public String [] Name = {"Николай", "Петр", "Виктор", "Никита", "Женя", "Петр", "Владимир", "Игорь", "Максим", "Мекан"};
    public String [] LastName = {"Шапиро", "Живаго", "Никитенко", "Нетто", "Штольберг", "Дей", "Грабчак"};
    public String [] SecondName = {"Владимирович", "Сергеевич", "Никитич", "Петргович", "Максимович", "Олегович"};
    public String [] StudentAge = {"18" , "19" , "20" , "21" , "22" , "23"};

    public String [] Group = {"8Т92", "8Т91"};

    public  String [] FormEducation= {"Очная" , "Заочная"};
}

 class Human{

    Random rn = new Random();

    protected Date dat = new Date();
    private String Name;
    private  String SecondName;
    private String LastName;
    private String Age;

    public String getName(){
        return Name;
    }
    public void setName (String newName){
        Name = newName;
    }

    public String getSecondName(){
         return SecondName;
    }
    public void setSecondName (String newSecondName){
         SecondName = newSecondName;
    }

    public String getLastName(){
         return LastName;
    }
    public void setLastName (String newLastName){
        LastName = newLastName;
    }

    public String getAge(){
        return  Age;
    }
    public void setAge(String newAge){
        Age = newAge;
    }

    public Human(){
        setLastName(dat.LastName[rn.nextInt(7)]);
        setName(dat.Name[rn.nextInt(10)]);
        setSecondName(dat.SecondName[rn.nextInt(6)]);
        setAge(dat.StudentAge[rn.nextInt(6)]);
    }

    public void getDescription(){
        System.out.println("Class: Human\t"+"getName: " + getName()+ " getSecondName: "+ getSecondName()+ " getLastName: " +getLastName()+" getAge:"+getAge());
    }
}

 class Students extends  Human{

     private String Group;

     public String getGroup(){
         return Group;
     }
     public void setGroup(String newGroup){
         Group = newGroup;
     }

     public Students()
     {
         Group = new String();
         setLastName(dat.LastName[rn.nextInt(7)]);
         setName(dat.Name[rn.nextInt(10)]);
         setSecondName(dat.SecondName[rn.nextInt(6)]);
         setAge(dat.StudentAge[rn.nextInt(6)]);
         setGroup(dat.Group[rn.nextInt(2)]);

     }

     public void getDescription(){
         System.out.println("Class: Student\t"+"getName: " + getName()+ " getSecondName: "+ getSecondName()+ " getLastName: " +getLastName()+" getAge:"+getAge()+" getGroup: " +getGroup());
     }
}

class FormEducation extends  Students{
    private String Form;

    public String getForm(){
        return  Form;
    }
    public void setForm(String newForm){
        Form = newForm;
    }

    public FormEducation(){
        Form =new String();
        setLastName(dat.LastName[rn.nextInt(7)]);
        setName(dat.Name[rn.nextInt(10)]);
        setSecondName(dat.SecondName[rn.nextInt(6)]);
        setAge(dat.StudentAge[rn.nextInt(6)]);
        setGroup(dat.Group[rn.nextInt(2)]);
        setForm(dat.FormEducation[rn.nextInt(2)]);

    }

    public void getDescription(){
        System.out.println("Class: FormEducation\t"+"getName: " + getName()+ " getSecondName: "+ getSecondName()+ " getLastName: " +getLastName()+" getAge:"+getAge()+" getGroup: " +getGroup() + " getForm: " + getForm());
    }


}

public class First {

   public static void main(String[] args) {
       Random rn = new Random();
       Date date = new Date();
       Scanner scan = new Scanner(System.in);

       System.out.println("Введите количество учеников в Вузе");
       int N = scan.nextInt(); // кол-во студентов

       Human ArrStudents[] = new Human[N]; // массив с кол-вом студентов

       for (int i = 0; i < N; i++) {
           int X = rn.nextInt(3);
           switch (X) {
               case 0:
                   ArrStudents[i] = new Human();
                   break;
               case 1:
                   ArrStudents[i] = new Students();
                   break;
               case 2:
                   ArrStudents[i] = new FormEducation();
                   break;
           }
       }

       for(int i = 0; i <N;i++){
           ArrStudents[i].getDescription();
       }
   }
}
*/


// 2 лаба
/*class Storehouse   {
    public int Size = 100;

    public synchronized void TakeProduct(){ //Забирает товар со склада
        Size -=1;
        System.out.println("Товар со склада забрал, осталось: " + Size);
    }

    public synchronized void GivenProduct(){ //Привозит товар со склада
        Size +=1;
        System.out.println("Товар на склад привез, сейчас там: " + Size);
    }
}

class First extends Methods {
    public static void main(String[] args) throws InterruptedException {
        Methods methods = new Methods();

        methods.threadTake.start();
        methods.threadGiven.start();

    }
}

    class Methods{
        Storehouse storehouse = new Storehouse();
        Runnable runnableGiven = new Runnable() {
            @Override
            public synchronized void run() {
                for(;;)
                {
                    storehouse.GivenProduct();
                    if(storehouse.Size > 199){
                        try {
                            System.out.println("Работа потока" + Thread.currentThread().getName() + " приостановлена, т.к. на скаде нет места для товара");
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        Runnable runnableTake = new Runnable() {
            @Override
            public synchronized void run() {
                for(;;){
                    storehouse.TakeProduct();
                    if (storehouse.Size < 1){
                        try {
                            System.out.println("Работа потока" + Thread.currentThread().getName() + " приостановлена, т.к. на складе нет товара");
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        };

        Thread threadGiven = new Thread(runnableGiven);
        Thread threadTake = new Thread(runnableTake);

    }
*/


// 4 лаба
/*class First {
    public static void main(String[] args) throws IOException {

        FileReader file = new FileReader("Laba.txt");
        BufferedReader br = new BufferedReader(file);
        String line = br.readLine();

        Pattern pattern = Pattern.compile("\\d+\\W\\d+"); // Регулярное выражение
        Matcher m = pattern.matcher(line);

        String firstNumber ="";
        String secondNumber = "";

        boolean boolReturn = false;

        while (m.find()) {
            for (int i = 0; i < 1; i++) {
                String str = m.group();

                for (int j = 0; j < str.length(); j++) {
                    char ch = str.charAt(j);
                    if (ch != '+' && boolReturn == false) {
                        firstNumber = firstNumber + str.charAt(j);

                    }
                    if (ch == '+') {
                        boolReturn = true;
                        j++;
                    }
                    if (boolReturn == true) {
                        secondNumber = secondNumber + str.charAt(j);
                    }
                }
            }
        }

        int firstValue = Integer.parseInt(firstNumber);
        int secondValue = Integer.parseInt(secondNumber);
        int result = firstValue + secondValue;

        System.out.println("Задана строка: " + line  + "\nСумма выражения равна " + result);
    }
}
*/


// 5 лаба
class First{
    public static void main(String [] args){

    }

    class Room{

        private int area; // площаль комнаты
        private String type; // тип комнаты

        public Room(int area, String type){ // конструктор
            this.area = area;
            this.type = type;
        }



    }
}