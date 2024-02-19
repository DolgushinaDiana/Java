#include <iostream>
using namespace std;
const int n=3;
struct Box
{
    int lengh;
    int wight;
    int height;// sm
    double weight;// kg
    int value;// money
        
    /* Box(int l, int wi,int h,double w,int v): 
    lengh(l),wight{wi},height(h),weight(w),value(v){}
    int getLenght(){
        return lengh;
    } */
        
};
double FunSum(Box[n]);// +
bool check(Box[n],int);// +
double maxWeight(Box[n],int);// +
bool boxInBox(Box[n]);// 

int main(){
    cout<<"+ нужна защита от дураков"<<endl<<endl<<endl;

    /* cout<<"аааа как ты меня заебал"<<endl;
    cout<<"ублюдский язык"<<endl;
    cout<<"сил моих на тебя нет"<<endl;
    cout<<"век бы тобой не занималась"<<endl;
    cout<<"чтоб те пусто было!"<<endl; */
    
    
    Box box1 ={2,3,1,4.3,10};
    Box box2 ={2,5,8,2,1};
    Box box3 ={4,7,9,6,8};
    /* box.height=6; */
    
    /* cin>> n; */


    Box boxes[n]={box1,box2,box3};
    double sum=FunSum(boxes);
    
    cout<<sum<<endl;
    cout<<check(boxes,25)<<endl;
    cout<<maxWeight(boxes,20)<<endl;

    return 0;
}
double FunSum(Box b[n])
{
    double sum=0;
    for (int i = 0; i < n; i++)
    {
    sum+=b[i].value;
    }
    return sum;
}
bool check(Box box[n],int m){
    bool c=true;
    /* int i=0;
    while (box && c==true)
    {
        if (box[i].lengh+box[i].wight+box[i].height>m)
        {
            c=false;
        }
        i++;
    } */
    for (int i = 0; i < n; i++)
    {
        if (box[i].lengh+box[i].wight+box[i].height>m)
        {
            c=false;
        }
    }
    return c;
}
double maxWeight(Box box[n],int maxV){
    double mv=-1;
    for (int i = 0; i < n; i++)
    {
        if (box[i].lengh*box[i].wight*box[i].height<maxV)
        {
            if (box[i].weight>mv)
            {
                mv=box[i].weight;
            }
            
        }
    }
    return mv;
}

