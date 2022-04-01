public class App {
    public static void main(String[] args) throws Exception {
      circles x = new circles();

      System.out.println(x.typeOfCircle());
      System.out.println(x.typeOfCircle("wheat"));

      System.out.println("Override Example:" + x.area);
    }
}
