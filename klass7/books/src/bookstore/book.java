package bookstore;
 
public class book{
 
    public String name;
    public String author;
    public int year;
     
    book(){ 
     
        name = "неизвестно";
        author = "неизвестно";
        year = 0;
    }
 
    book(String name, String author, int year){
         
        this.name = name;
        this.author = author;
        this.year = year;
    }
     
    public void info(){
        System.out.printf(" нига '%s' (автор %s) была издана в %d году \n", name, author, year);
    } 
    public double summa(double x1, double x2) {
        return x1 + x2;
    }
     
    public double summa(double x1, double x2, double x3) {
        return x1 + x2 + x3;
    }
     
    public double summa(double x1, double x2, double x3, double x4) {
        return x1 + x2 + x3 + x4;
    }
}