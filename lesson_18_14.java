public class lesson_18_14 {
    //В этой задаче тебе предстоит создать универсальный инструмент для поиска минимальных и максимальных чисел.
    //В классе MinMaxUtil создай публичные статические методы min() и max(),
    //которые в качестве аргументов принимают целочисленные (тип int) значения и возвращают минимальное и максимальное из них соответственно.
    //Каждый из методов должен быть перегружен так, чтобы была возможность вызвать метод с двумя, тремя, четырьмя и пятью параметрами.
    //В общем, необходимо создать 8 методов, — 4 для min() и 4 для max().
    //Все аргументы методов должны быть типа int.
    public static int min (int a, int b)
    {
        if (a>b)
        {
            return b;
        }
        else return a;
    }
    public static int min (int a, int b, int c)
    {
        if (a<b && a<c)
        {
            return a;
        }
        else if (b<c && b<a)
        {
            return b;
        }
        else return c;
    }
    public static int min (int a, int b, int c, int d)
    {
        if (a<b && a<c && a<d)
        {
            return a;
        }
        else if (b<c && b<a && b<d)
        {
            return b;
        }
        else if (c<b && c<a && c<d)
        {
            return c;
        }
        else return d;
    }
    public static int min (int a, int b, int c, int d, int f)
    {
        if (a<b && a<c && a<d && a<f)
        {
            return a;
        }
        else if (b<c && b<a && b<d && b<f)
        {
            return b;
        }
        else if (c<b && c<a && c<d && c<f)
        {
            return c;
        }
        else if (d<a && d<b && d<c && d<f)
        {
            return d;
        }
        else return f;
    }
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c) {
        return max(c, max(a, b));
    }

    public static int max(int a, int b, int c, int d) {
        return max(d, max(a, b, c));
    }

    public static int max(int a, int b, int c, int d, int e) {
        return max(e, max(a, b, c, d));
    }
}

