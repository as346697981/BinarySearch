/*
 * 二分查找工具类
 * 数组默认采用升序
 */
public class search {
	//递归
	public static int binarySearch(int a[],int m ,int n,int key){
		if(a==null ||m>n||n<=0){
			return -1;
		}
		if(a[(m+n)/2]>key){
			return binarySearch(a,m,(m+n)/2-1,key);
		}
		else if(a[(m+n)/2]<key){
			return binarySearch(a,(m+n)/2+1,n,key);
		}
		else 
			return (m+n)/2;
	}
	//循环
	public static int binarySearch2(int a[],int m ,int key){
		if(a==null||m<0){
			return -1;
		}
		int left=0,right=m-1;
		int  middle =-1;
		while(left<=right){
			middle = (left+right)/2;
			if(a[middle]>key){
				right = middle-1;
			}
			else if(a[middle]<key){
				left = middle+1;
			}
			else
				return middle;
		}
		return -1;
	}
}
