// class Solution {
// public:
//     int maxArea(vector<int>& height) {
//        int n=height.size();
//        int i=0,j=n-1;
//        int ma=0;
//        while(i<j){
//         ma=max(ma,min(height[i],height[j])*(j-i));
//         if(height[i]>height[j])j--;
//         else i++;
//        }
//        return ma;
//     }
// };


class Solution{
public:
    int maxArea(vector<int>& height){
        int l =0; 
        int r = height.size()-1;
        int maxarea = 0;

        while(l<r){
            int h = min(height[l], height[r]);
            int w = r-l;
            int area = h*w;

            maxarea = max(maxarea, area);

            if(height[l]< height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxarea;
    }    
};