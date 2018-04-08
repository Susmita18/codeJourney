# codeJourney
start of web developer bootcamp
change

def my_final_grade_calculation(filename):
    file_pointer = open(filename, 'r')
    data = file_pointer.readlines()
    dict_={}
    for line in data:
        #a=[]
        #q=[]
        #dict={}
        name, q1, q2, q3, q4, q5, q6, a1, a2, a3, a4, midterm, final =  line.strip().split(',')
        q=[int(q1),int(q2),int(q3),int(q4),int(q5),int(q6)]
        a=[int(a1),int(a2),int(a3),int(a4)]
        #int(midterm)
        #int(final)
        for i in range(0,2):
            q.remove(min(q))  
        a.remove(min(a))
        a_avg=0.0
        for j in range(0,len(a)):
            a_avg+=a[j]/len(a)
        q_avg=0.0
        for i in range(0,len(q)):
            q_avg+=q[i]/len(q)
        final = ((float(q_avg)/4)) + ((float(a_avg)/4)) + ((float(midterm)/4)) + ((float(final)/4))
        if final>=60.0:
            out='pass'
            dict_[name]=out
        else:
            out='fail'
            dict_[name]=out
    return dict_

#calling function  
print(my_final_grade_calculation('r.txt'))
END OF CODE
