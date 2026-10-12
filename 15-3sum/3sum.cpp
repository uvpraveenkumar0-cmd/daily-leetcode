class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        set<vector<int>>st;
        int n=nums.size();
        vector<vector<int>>ans;
        for(int i=0;i<n;i++){
            int j=i+1,k=n-1;
            while(j<k){
                long long sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    if(st.find({nums[i],nums[j],nums[k]})==st.end()){
                        ans.push_back({nums[i],nums[j],nums[k]});
                        st.insert({nums[i],nums[j],nums[k]});
                    }
                    j++;
                    k--;
                }
                else if(sum>0)k--;
                else j++;
            }
        }
        return ans;
    }
};