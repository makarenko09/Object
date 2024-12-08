public class Main {
    public static void main(String[] args) {
        Author rasputinAuthor = new Author("Григорий", "Распутин");

        System.out.println("rasputin.name =" + rasputinAuthor.getName());
        System.out.println("rasputin.surename =" + rasputinAuthor.getSurname());
        Book rasputin = new Book(rasputinAuthor, "Мои мысли и размышления", 1915);

        System.out.println("rasputin.author = " + rasputin.getAuthor());
        System.out.println("rasputin.Title = " + rasputin.getTitle());
        System.out.println("rasputin.RealiseYear = " + rasputin.getRealiseYear());

        rasputin.setRealiseYear(2013);
        System.out.println("rasputin.RealiseYear = " + rasputin.getRealiseYear());
        //
        Author zelandAuthor = new Author("Вадим", "Зеланд");

        System.out.println("zeland.name =" + zelandAuthor.getName());
        System.out.println("zeland.surename =" + zelandAuthor.getSurname());
        Book zeland = new Book(zelandAuthor, "«Трансерфинг реальности. Ступень IV: Управление реальностью»", 2005);

        System.out.println("zeland.author = " + zeland.getAuthor());
        System.out.println("zeland.Title = " + zeland.getTitle());
        System.out.println("zeland.RealiseYear = " + zeland.getRealiseYear());

        zeland.setRealiseYear(2004);
        System.out.println("zeland.RealiseYear = " + zeland.getRealiseYear());
    }
}