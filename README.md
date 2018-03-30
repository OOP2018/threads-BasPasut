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
| Using ReentrantLock     |         10,000,000 | 0.760960        |
| Syncronized method      |         10,000,000 | 0.713760        |
| AtomicLong for total    |         10,000,000 | 0.253438        |

## 1. Using unsynchronized counter object

1.1 The total should be zero, but in the test show that the total is hardly to be zero, and it's always return different results.  
1.2 In the table.  
1.3 Because when we ran two thread in one time, they also have operation inside each thread, too. There are load, change, and replace. Each thread is running by itself, so it makes the result when they load, change, and replace incorrect.

## 2. Implications for Multi-threaded Applications

How might this affect real applications?  
answer: It will occur mistake when you want to withdraw money from one source and other people also want to withdraw money from the same source at the same time.

## 3. Counter with ReentrantLock

3.1 The total is always zero.  
3.2 Because this time we use ReentrantLock. When it run one thread, it will lock until that thread finish operation and then unlock. So, 2 thread won't run at the same time.  
3.3 ReentrantLock gives a lock to the current working thread and blocks all other threads which are trying to take a lock on the shared resource. So, it fit to use when we have to run more than one thread and shared resource.  
3.4 It will unlock the thread when try block exits.

## 4. Counter with synchronized method

4.1 The total is always zero.  
4.2 Because when we use synchronized as the type of the method, it can prevent calling this method again until the processes finish. So, it can avoid thread to call add method when the process hasn't finish yet.  
4.3 Synchronized can prevent method to call again when it is used by the other, so it fit when we have to run more than one thread and shared resource.

## 5. Counter with AtomicLong

5.1 AtomicLong will be updated atomically means it will be thread safe.  
5.2 AtomicLong is used where we want to add and subtract values from a variable atomically.

## 6. Analysis of Results

6.1 AtomicLong is the fastest and ReentrantLock is the slowest.  
6.2 In my opinion, I think ReentrantLock is the most flexible way to handle this problem. Because it can use with many resource, but AtomicLong can use only with number. Synchronized may have less runtime, but it have to synchronized all statement the method. So, if that method have only first 2 statement that have shared resource, but others 10 statement in that method don't. It will waste moretime. If we use ReentrantLock, we can choose when to lock and unlock. So, it makes ReentrantLock more flexible than other solution.

## 7. Using Many Threads (optional)
