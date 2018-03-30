## Threads and Synchronization

This lab illustrates the problem of synchronization when many threads are operating on a shared object.  The general issue is called "thread safety", and it is a major cause of errors in computer software.

## Assignment

To the problems on the lab sheet and record your answers here.

1. Record average run times.
2. Write your explanation of the results.  Use good English and proper grammar.  Also use good Markdown formatting.

## ThreadCount run times

These are the average runtime using 3 or more runs of the application.
The Counter class is the object being shared by the threads.
The threads use the counter to add and subtract values.

| Counter class           | Limit              | Runtime (sec)   |
|:------------------------|:-------------------|-----------------|
| Unsynchronized counter  |         10,000,000 | 0.015469        |
| Using ReentrantLock     |         10,000,000 | 0.760960       |
| Syncronized method      |         10,000,000 | 0.890829        |
| AtomicLong for total    |         10,000,000 | 0.253438        |

## 1. Using unsynchronized counter object

1.1 The total should be zero, but in the test show that the total is hardly to be zero, and it's always return different results.  
1.2 In the table.  
1.3 Because when we ran two thread in one time, they also have operation inside each thread, too. There are load, change, and replace. Each thread is running by itself, so it makes the result when they load, change, and replace incorrect.

## 2. Implications for Multi-threaded Applications

How might this affect real applications?  

## 3. Counter with ReentrantLock

answer questions 3.1 - 3.4

## 4. Counter with synchronized method

answer question 4

## 5. Counter with AtomicLong

answer question 5

## 6. Analysis of Results

answer question 6

## 7. Using Many Threads (optional)
