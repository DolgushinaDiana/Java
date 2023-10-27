import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Point3D one = new Point3D();
        Point3D two = new Point3D(1.0, 3.0, 5.0);
        Point3D tri = new Point3D(3.0, -5.0, 7.0);
        System.out.println("векторы: ");
        one.printPoint();
        two.printPoint();
        tri.printPoint();
        System.out.println("равна ли точка другой точке " + two.equality(one));
        System.out.println("равна ли точка другой точке(самой себе) " + two.equality(two));
        Vector3D oneV = new Vector3D();
        Vector3D twoV = new Vector3D(two, tri);
        Vector3D triV = new Vector3D(-2.0, 4.0, 6.0);
        twoV.printVec();
        triV.printVec();
        double lenVec = twoV.lenghtVec();
        System.out.println("равны ли вектора(равен сам себе) " + twoV.ravenstvoVecrorov(twoV));
        System.out.println("равны ли вектора(разные) " + twoV.ravenstvoVecrorov(triV));
        System.out.println("длина вектора: " + lenVec);
        Vector3D summa = new Vector3D();
        Vector3D buff = new Vector3D();
        Vector3D ras = new Vector3D();
        summa=Vector3DProcessor.sumVec(twoV, triV);
        System.out.print("сумма векторов: ");
        summa.printVec();
        ras=Vector3DProcessor.rasVec(summa, twoV);
        System.out.print("разность векторов: ");
        ras.printVec();
        System.out.println("скалярное произведение векторов: " + Vector3DProcessor.skalar(summa, twoV));
        System.out.println("проверка на коллинеарность: " + Vector3DProcessor.kolPro(oneV, twoV));
        buff=Vector3DProcessor.vecPro(summa, twoV);
        System.out.print("векторное произведение векторов: ");
        buff.printVec();
        System.out.println("вспомогательные векторы:");
        Vector3D v = new Vector3D(3.0, 9.0, 6.0);
        Vector3D vi = new Vector3D(2.0, 2.0, 2.0);
        Vector3D vec = new Vector3D(6.0, 4.0, 3.0);
        System.out.println("вспомогательные вектор v");
        v.printVec();
        System.out.println("вспомогательные вектор vi");
        vi.printVec();
        System.out.println("вспомогательные вектор vec");
        vec.printVec();
        new Vector3D();

        int n=5;
        Vector3DArray array = new Vector3DArray(n);

        int l = array.lenMas();
        System.out.println("массив векторов");
        array.printArray();
        array.replace(v, 1);
        array.replace(vec, 4);
        System.out.println("массив после замены 2-х векторов");
        array.printArray();
        double lena = array.maxLen();
        int ind = array.findVec(vi);
        int ind2 = array.findVec(v);
        Vector3D sumAllVec = array.sumVector();
        System.out.println("длина массива: " + l);
        System.out.println("длина самого длинного вектора: " + lena);
        System.out.println("индекс заданного вектора(vi):  " + ind);
        System.out.println("индекс заданного вектора(v):  " + ind2);
        System.out.println("сумма всех векторов массива: " + sumAllVec.getX() + " " + sumAllVec.getY() + " " + sumAllVec.getZ());
        double[] mas = new double[7];
        Vector3D lK ;
        for(int i = 0; i < mas.length; ++i) {
            mas[i] = (i * 2 % 7);
            System.out.println(mas[i]);
        }
        lK=array.linKom(mas);
        System.out.print("линейная комбинация векторов: ");
        lK.printVec();
        double[] mas2 = new double[array.lenMas()];
        for(int i = 0; i < mas2.length; ++i) {
            mas2[i] = (i * 2 % 6 - 1);
            System.out.println(mas2[i]);
        }
        lK=array.linKom(mas2);
        System.out.print("линейная комбинация векторов (попытка 2) ");
        lK.printVec();
        Point3D[] masP = new Point3D[array.lenMas()];
        System.out.print("сдвигаем точку ");
        tri.printPoint();
        int size;
        for(size = 0; size < masP.length; ++size) {
            masP[size] = new Point3D();
        }
        array.eighteen(tri, masP);
        for(size = 0; size < masP.length; ++size) {
            masP[size].printPoint();
        }

        // блок 2
        /*System.out.print("размер массива ");
        size = sc.nextInt();
        double[] arr = new double[size];
        System.out.println("ввод массива");
        Block2.vvodMas(arr, size);
        System.out.println("вывод массива");
        Block2.printMas(arr);
        System.out.println("сумма элементов массива = " + Block2.sumElem(arr, sum));
        System.out.println("количество четных чисел в массиве " + Block2.evenNumber(arr, count));
        System.out.println("ввод левой и правой границы");
        double lev = sc.nextDouble();
        double prav = sc.nextDouble();
        System.out.println("количество элементов принадлежащих отрезку [" + lev + ", " + prav + "] = " + Block2.tvelve(arr, lev, prav));
        System.out.println("все ли элементы четные " + Block2.thirteen(arr, bo));
        Block2.reverse(arr);
        System.out.println("массив в обатном порядке ");
        Block2.printMas(arr);*/

        // блок 1

        /*Block1.tabulSin(-1, 0.5, 0.2);
        double sT;
        sT=Block1.seriesTailor(0.05,3);
        System.out.println(sT);
        double[] solve=new double[2];
        solve[0]=0;
        solve[1]=0;
        Block1.solveEquation(5,2,7,2,1,9,solve);    // 5x + 2y = 7
        System.out.printf("x = "+solve[0]+" y = "+solve[1]);          */       // 2x + y  = 9

    }
}
