public class Main {


    public static void main(String[] args) {
        Book rasputin = new Book("Распутин, Г.Е.", "Мои мысли и размышления", 1915);
        System.out.println(" rasputin.author = " + rasputin.getAuthor());
        System.out.println(" rasputin.Title = " + rasputin.getTitle());
        System.out.println(" rasputin.RealiseYear = " + rasputin.getRealiseYear());

        Author rasputinAuthor = new Author("Григорий", "Распутин");
        System.out.println("rasputin.name =" + rasputinAuthor.getName());
        System.out.println("rasputin.surename =" + rasputinAuthor.getSurname());
        rasputin.setRealiseYear(2013);
        System.out.println(" rasputin.RealiseYear = " + rasputin.getRealiseYear());

    }
}
