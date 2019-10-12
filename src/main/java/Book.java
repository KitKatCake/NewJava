import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String bookname;
    private String author;
    private String address;
    private double price;

    public Book() {

    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        if(price < 10.0f)
            price = 10.0f;
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void introduce(Book book[]) {
        Book bok = new Book();
        Book bokk = new Book();
        Book book1[] = {bok, bokk};

        book1[0].setBookname("红楼梦");
        book1[0].setAuthor("曹雪芹");
        book1[0].setAddress("人民文学出版社");
        book1[0].setPrice(9.0f);
        System.out.println("书名: "+book1[0].getBookname() + "\n作者: " + book1[0].getAuthor() + "\n出版社: " +
                book1[0].getAddress() + "\n价格: " +
                book1[0].getPrice());

        book1[1].setBookname("小李飞刀");
        book1[1].setAuthor("古龙");
        book1[1].setAddress("中国长安出版社");
        book1[1].setPrice(55.5f);
        System.out.println("书名: "+book1[1].getBookname() + "\n作者: " + book1[1].getAuthor() + "\n出版社: " +
                book1[1].getAddress() + "\n价格: " +
                book1[1].getPrice());


    }
    public static void introduce(ArrayList<Book> arrayList){
        Book book = new Book();
        Book book1 = new Book();

        arrayList.add(book);
        arrayList.add(book1);

        arrayList.get(0).setBookname("红楼梦");
        arrayList.get(0).setAuthor("曹雪芹");
        arrayList.get(0).setAddress("人名文学出版社");
        arrayList.get(0).setPrice(9.0f);

        arrayList.get(1).setBookname("小李飞刀");
        arrayList.get(1).setAuthor("古龙");
        arrayList.get(1).setAddress("中国长安出版社");
        arrayList.get(1).setPrice(55.5f);

        for(int i=0;i<arrayList.size();i++){
            System.out.println("书名: "+arrayList.get(i).getBookname()+"\n作者: "+arrayList.get(i).getAuthor()+"\n出版社: "+arrayList.get(i).getAddress()
                    +"\n价格: "+arrayList.get(i).getPrice());
        }

    }

    public Book(String bookname,String author,String address,double price){
        this.bookname = bookname;
        this.author = author;
        this.address = address;
        this.price = price;
    }

    public static void main(String[] args) {



        //Book book = new Book("红楼梦","曹雪芹","人民文学出版社",9.0f);

        //Book bookk = new Book("小李飞刀","古龙","中国长安出版社",55.5f);

//        Book bookkk[] = {book, bookk};
//
//        introduce(bookkk);

        List<Book> arrayList = new ArrayList<Book>(2);

//        arrayList.add(book);
//
//        arrayList.add(bookk);
//
//        arrayList.get(0).setBookname("红楼梦");
//        arrayList.get(0).setAuthor("曹雪芹");
//        arrayList.get(0).setAddress("人名文学出版社");
//        arrayList.get(0).setPrice(9.0f);

        introduce((ArrayList<Book>) arrayList);







    }
}
