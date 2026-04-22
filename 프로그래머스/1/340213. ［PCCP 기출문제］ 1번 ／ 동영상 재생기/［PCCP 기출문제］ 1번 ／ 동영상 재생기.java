class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        /* 
            초로 바꾸는게 좋을듯?
        */
        String[] video_lens = video_len.split(":");
        String[] poss = pos.split(":");
        String[] op_starts = op_start.split(":");
        String[] op_ends = op_end.split(":");
        
        int video_len_ss = Integer.valueOf(video_lens[0]) * 60 + Integer.valueOf(video_lens[1]);
        int pos_ss = Integer.valueOf(poss[0]) * 60 + Integer.valueOf(poss[1]);
        int op_start_ss = Integer.valueOf(op_starts[0]) * 60 + Integer.valueOf(op_starts[1]);
        int op_end_ss = Integer.valueOf(op_ends[0]) * 60 + Integer.valueOf(op_ends[1]);
        
        for(int i = 0 ; i < commands.length; i++){
            if(pos_ss >= op_start_ss && pos_ss <= op_end_ss) 
                pos_ss = op_end_ss;
        
            String command = commands[i];
            switch(command){
                case "prev": 
                    pos_ss -= 10;
                    if(pos_ss < 0)
                        pos_ss = 0;
                    break;
                case "next": 
                    pos_ss += 10;
                    if(pos_ss > video_len_ss)
                        pos_ss = video_len_ss;
                    break;
            }
        }
        
        if(pos_ss >= op_start_ss && pos_ss <= op_end_ss) 
            pos_ss = op_end_ss;
        
        
        int time = pos_ss / 60;
        int minute = pos_ss % 60;
        
        String times = "";
        
        if(time < 10)
            times += "0" + time + ":";
        else
            times += time + ":";
        
        
        if(minute < 10)
            times += "0" + minute;
        else
            times += minute;
        
        answer = times;
        return answer;
    }
}