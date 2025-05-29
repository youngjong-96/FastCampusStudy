public class ArrayTest {
    public static void main(String[] args) {
        Book []b=new Book[2];
        b[0]=new Book();
        b[1]=new Book();

        b[0].author="Mr.Lee";
        b[0].title="java";
        b[0].company="muje";
        b[0].page=111;

        b[1].author="Mr.Kim";
        b[1].title="python";
        b[1].company="easy";
        b[1].page=351;

        for(int i=0;i<b.length;i++){
            System.out.println(b[i].author+"\t"+b[i].title+"\t"+b[i].company+"\t"+b[i].page);
        }
    }
}
