package bookstore;
 
public class bookstore {
 
    public static void main(String[] args) {
         
        book b1 = new book("Отцы и дети", "И. С. Тургенев", 1865);
        b1.info();
 
        book b2 = new book("Обломов","И. И. Гончаров", 1859);
        b2.info();
        
        book b3 = new book();
        b3.info();
    } 
}