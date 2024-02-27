#include <iostream>
#include "test2.h"

using namespace std;
const int n = 3;

struct Box
{
    int lengh, wight, height; // sm
    double weight;            // kg
    int value;                // money

    Box(int l, int wi, int h, double w, int v) : lengh(l), wight{wi}, height(h), weight(w), value(v) {}
    int getLenght()
    {
        return lengh;
    }
};

double FunSum(Box[n]);         // 2 +
bool check(Box[n], int);       // 3 +
double maxWeight(Box[n], int); // 4 +
bool boxInBox(Box[n]);         // 5 +
bool equals(Box, Box);         // 6 +

const double ACC = 0.0001;
bool operator==(Box b1, Box b2)
{
    return (
        b1.height - b2.height < ACC &&
        b1.lengh - b2.lengh < ACC &&
        b1.wight - b2.wight < ACC &&
        b1.value - b2.value < ACC &&
        b1.weight - b2.weight < ACC);
}
ostream& operator<<(ostream& out,Box& cn){
    out<<cn.height<<" "<<cn.lengh<<" "<<cn.value<<" "<<cn.weight<<" "<<cn.wight<<endl;
}

// main
int main()
{
    int f=fun();
    cout<<f;



    setlocale(LC_ALL, "Russian");
    cout << "+ нужна защита от дураков" << endl
         << endl
         << endl;

    cout << "ублюдский язык" << endl;
    cout << "сил моих на тебя нет" << endl;
    cout << "век бы тобой не занималась" << endl;
    cout << "чтоб те пусто было!" << endl
         << endl;

    Box box1 = {2, 3, 1, 4.3, 10};
    Box box2 = {7, 8, 10, 2, 1};
    Box box3 = {4, 7, 9, 6, 8};

    Box boxes[n] = {box3, box2, box1};
    double sum = FunSum(boxes);

    cout << sum << endl;
    cout << check(boxes, 25) << endl;
    cout << maxWeight(boxes, 20) << endl;

    bool b = boxInBox(boxes);
    cout << b << endl;
    cout<<box1;

    return 0;
}

#ifndef MODUL
#define MODUL
double FunSum(Box b[n])
{
    double sum = 0;
    for (int i = 0; i < n; i++)
    {
        sum += b[i].value;
    }
    return sum;
}
bool check(Box box[n], int m)
{
    bool c = true;
    for (int i = 0; i < n; i++)
    {
        if (box[i].lengh + box[i].wight + box[i].height > m)
        {
            c = false;
        }
    }
    return c;
}
double maxWeight(Box box[n], int maxV)
{
    if (maxV < 0)
    {
        cout << "error" << endl;
    }
    double mv = -1;
    for (int i = 0; i < n; i++)
    {
        if (box[i].lengh * box[i].wight * box[i].height < maxV)
        {
            if (box[i].weight > mv)
            {
                mv = box[i].weight;
            }
        }
    }
    return mv;
}
bool boxInBox(Box b[n])
{
    bool in = true;
    int maxBox = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if ((b[i].lengh < b[j].lengh && b[i].wight < b[j].wight && b[i].height < b[j].height) ||
                (b[i].lengh > b[j].lengh && b[i].wight > b[j].wight && b[i].height > b[j].height))
            {
                cout << i << " " << j << " " << b[i].lengh << " " << b[j].lengh << endl;
            }
            else
            {
                cout << i << " " << j << " " << b[i].lengh << " " << b[j].lengh << endl;
                in = false;
            }
            cout << in << endl;
            if (in == false)
                break;
        }
    }
    return in;
}
bool equals(Box b1, Box b2)
{
    return b1.height == b2.height && b1.lengh == b2.lengh && b1.wight == b2.wight && b1.value == b2.value && b1.weight == b2.weight;
}
class Conteiner
{
private:
    Box boxes[n];
    int lengh, height, wight;
    int weightMax;
};

#endif

