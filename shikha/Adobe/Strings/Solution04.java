/* Given an array of names (consisting of lowercase characters) of candidates in an election. A candidate name in array represents a vote casted to the candidate. Print the name of candidate that received Max votes. If there is tie, print lexicographically smaller name.

Example 1:

Input:
n = 13
Votes[] = {john,johnny,jackie,johnny,john 
jackie,jamie,jamie,john,johnny,jamie,
johnny,john}
Output: john 4
Explanation: john has 4 votes casted for 
him, but so does johny. john is 
lexicographically smaller, so we print 
john and the votes he received.
Example 2:

Input:
n = 3
Votes[] = {andy,blake,clark}
Output: andy 1
Explanation: All the candidates get 1 
votes each. We print andy as it is 
lexicographically smaller. */


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        HashMap<String,Integer> list = new HashMap<>();
        for(int i=0;i<arr.length;i++){
        	if(list.containsKey(arr[i])) {
        		list.put(arr[i], list.get(arr[i])+1);
        	}else {
        		list.put(arr[i], 1);
        	}
            
        }String winner = "";
        int maxVotes = 0;
        for(Map.Entry<String, Integer> entry : list.entrySet()) {
        	if(entry.getValue()>maxVotes){
        	    maxVotes = entry.getValue();
        	    winner = entry.getKey();
            }else if(entry.getValue()==maxVotes){
        	    if(winner.compareTo(entry.getKey())>0){
        		     winner = entry.getKey();
        		}
        	}
        }String s[] = {winner,String.valueOf(maxVotes)};
        return s;

    }
}
