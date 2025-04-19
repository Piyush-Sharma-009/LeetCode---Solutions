/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* middleNode(ListNode* head) {
        int cnt = 0;
        ListNode* temp = head;
        while(temp != NULL){
            cnt++;
            temp = temp->next;
        }
        if(cnt%2 == 0){
            cnt = cnt/2 +1;
            ListNode* temp1 = head;
        for(int i = 1;i<cnt;i++){
        temp1 = temp1->next;
        }
        return temp1;
        }
        else
        cnt = cnt/2  ;
        ListNode* temp1 = head;
        for(int i = 0;i<cnt;i++){
        temp1 = temp1->next;
        }
        return temp1;
    }
};
