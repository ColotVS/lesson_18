public class lesson_18_22 {
    //Настоящий артист должен уметь развлечь людей. И танцы, и пение — это часть развлечения.
    //Перед тобой 3 интерфейса:
    //Dance — танцующий,
    //Sing — поющий,
    //Artist — артист.
}

interface Artist extends Dance,Sing{

}
interface Dance{
    void dance();
}

interface Sing{
    void sing();
}
