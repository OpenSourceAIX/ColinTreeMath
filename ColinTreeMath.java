package cn.colintree.aix.ColinTreeMath;

import android.content.Context;
import android.util.Log;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.*;
import com.google.appinventor.components.runtime.*;
import com.google.appinventor.components.runtime.util.*;

@DesignerComponent(version = ColinTreeMath.VERSION,
    description = "by ColinTree at http://aix.colintree.cn",
    category = ComponentCategory.EXTENSION,
    nonVisible = true,
    iconName = "images/extension.png")

@SimpleObject(external = true)

public class ColinTreeMath extends AndroidNonvisibleComponent implements Component {
    public static final int VERSION = 1;
    private ComponentContainer container;
    private Context context;
    private static final String LOG_TAG = "ColinTreeMath";
    public ColinTreeMath(ComponentContainer container) {
        super(container.$form());
        this.container = container;
        context = (Context) container.$context();
        Log.d(LOG_TAG, "ColinTreeMath Created" );
    }
    
    // Max - Zui Da Shu
    @SimpleFunction(description = "Find the max number in the list, return min double if the list is empty. Also, please make sure there are all number in the list")
    public double Max(YailList list){
    	Object[] lst=list.toArray();
    	double tmp,max=Double.MIN_VALUE;
    	for (int i=0;i<list.size();i++){
    		tmp=new Double(lst[i].toString());
    		if (max<tmp) max=tmp;
    	}
    	return max;
    }
    // Min - Zui Xiao Shu
    @SimpleFunction(description = "Find the min number in the list, return max double if the list is empty. Also, please make sure there are all number in the list")
    public double Min(YailList list){
    	Object[] lst=list.toArray();
    	double tmp,min=Double.MAX_VALUE;
    	for (int i=0;i<list.size();i++){
    		tmp=new Double(lst[i].toString());
    		if (min>tmp) min=tmp;
    	}
    	return min;
    }
    // Average - Ping Jun
    @SimpleFunction(description = "Return the average of the numbers in the list. Please make sure there are all number in the list")
    public double Average(YailList list){
    	Object[] lst=list.toArray();
    	double tmp,tot=0;
    	for (int i=0;i<list.size();i++){
    		tmp=new Double(lst[i].toString());
    		tot+=tmp;
    	}
    	return tot/list.size();
    }
    // Bubble Sort in ascending order - Sheng Xu Mao Pao
    @SimpleFunction(description = "(Sheng Xu Pai Xu - Mao Pao Pai Xu) Sort the number in the list in ascending order. Please make sure there are all number in the list")
    public YailList SortAscend(YailList list){
    	Object[] rst=new Object[list.size()],lst=list.toArray();
    	double[] forSort=new double[list.size()];
    	double tmp;
    	for (int i=0;i<list.size();i++){
    		forSort[i]=new Double(lst[i].toString());
    	}
    	for (int i=0;i<(list.size()-1);i++){
    		for (int j=i+1;j<list.size();j++){
    			if (forSort[i]>forSort[j]){
    				tmp=forSort[i];
    				forSort[i]=forSort[j];
    				forSort[j]=tmp;
    			}
    		}
    	}
    	for (int i=0;i<list.size();i++){
    		rst[i]=forSort[i];
    	}
    	return YailList.makeList(rst);
    }
    // Sort in descending order - Jiang Xu Mao Pao
    @SimpleFunction(description = "(Jiang Xu Pai Xu - Mao Pao Pai Xu) Sort the number in the list in decending order. Please make sure there are all number in the list")
    public YailList SortDecend(YailList list){
    	Object[] rst=new Object[list.size()],lst=list.toArray();
    	double[] forSort=new double[list.size()];
    	double tmp;
    	for (int i=0;i<list.size();i++){
    		forSort[i]=new Double(lst[i].toString());
    	}
    	for (int i=0;i<(list.size()-1);i++){
    		for (int j=i+1;j<list.size();j++){
    			if (forSort[i]<forSort[j]){
    				tmp=forSort[i];
    				forSort[i]=forSort[j];
    				forSort[j]=tmp;
    			}
    		}
    	}
    	for (int i=0;i<list.size();i++){
    		rst[i]=forSort[i];
    	}
    	return YailList.makeList(rst);
    }
    //greatest common divisor - Zui Da Gong Yue Shu
    @SimpleFunction(description = "(Zui Da Gong Yue Shu)Return the greatest common divisor, auto-round down into integer if it is not")
    public int GCD(int number1,int number2){
    	if (number1==number2){
    		return number1;
    	}
    	if (number1<number2){
    		return GCD(number2,number1);
    	}else{
    		if ((number1%2==0)&&(number2%2==0)){
    			return GCD(number1>>1,number2>>1)<<1;
    		}else if ((number1%2==0)&&(number2%2!=0)){
    			return GCD(number1>>1,number2);
    		}else if ((number1%2!=0)&&(number2%2==0)){
    			return GCD(number1,number2>>1);
    		}else{
    			return GCD(number2,number1-number2);
    		}
    	}
    	//return number2?gcd(b,a%b):a;    //from qq1139855151 He Bei Shi Jia Zhuang Chen
    }
    //Least common multiple - Zui Xiao Gong Bei Shu
    @SimpleFunction(description = "(Zui Xiao Gong Bei Shu)Return the least common multiple, auto-round down into integer if it is not")
    public int LCM(int number1,int number2){
    	int gcd=GCD(number1,number2);
    	return number1*number2/gcd;
    }
    //Power - Qiu Mi
    @SimpleFunction(description = "(Qiu Mi: number^n)Return number^n")
    public double Power(double number,double n){
    	double tmp,y=1;
    	n=Math.floor(n);
    	while (true){
    		tmp=n%2;
    		n=Math.floor(n/2);
    		if (tmp==1)
    			y=y*number;
    		if (n==0)
    			break;
    		number=number*number;
    	}
    	return y;
    }
    //Pi - π
    @SimpleFunction(description = "(π)Return pi")
    public double Pi(){
    	return Math.PI;
    }
    //e - e
    @SimpleFunction(description = "(e)Return Natural logarithm e")
    public double e(){
    	return Math.E;
    }
    //Cube root (Li Fang Gen)
    @SimpleFunction(description = "(Li Fang Gen)Return 3√num")
    public double CbRt(double number){
    	return Math.cbrt(number);
    }
    //log10
    @SimpleFunction(description = "Return Log 10,number")
    public double Log10(double number){
    	return Math.log10(number);
    }
    //1/√num
    @SimpleFunction(description = "Return 1/√num")
    public double ROTSR(double number){
    	return 1/Math.sqrt(number);
    }
    //sqrt(number1^2 +number2^2)
    @SimpleFunction(description = "Return sqrt(number1^2 +number2^2)")
    public double hypot(double number1,double number2){
    	return Math.hypot(number1,number2);
    }
    //Prime number (Zhi Shu)
    @SimpleFunction(description = "Return true if number is prime number")
    public boolean Prime(int number){
    	if (number==2)
    		return true;
    	else if (number%2==0)
    		return false;
    	else for (int i=3;i<=Math.sqrt(number);i+=2)
    		if (number%i==0)
    			return false;
    	return true;
    }
}
