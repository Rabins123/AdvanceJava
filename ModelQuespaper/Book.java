

public class Book {
    int book_no;
    String book_name;
    int book_price;

    public Book(int booknum, String bookname, int bookprice){
        book_no=booknum;
        book_name=bookname;
        book_price=bookprice;
    }

    public void Display(){
     System.out.println(book_no);
     System.out.println(book_name);
     System.out.println(book_price);
    }

    
}

class SpecialEditionBook extends Book{
    int discount ;
    
    public SpecialEditionBook(int booknum, String bookname, int bookprice ,int d) {
        super(booknum, bookname, bookprice);
        discount=d;
        //TODO Auto-generated constructor stub
    }



    public void Display(){
      super.Display();
     System.out.println(discount);
    }
}

class Test{
    public static void main(String[] args){
        SpecialEditionBook sa=new SpecialEditionBook(100, "java", 500,10);

        sa.Display();
        // Book sa1=new Book(100, "java", 500);
        // sa1.Display();
    }
}
