// Hashtable = A data structure that stores unique keys to values ex.<Integer, String>
        //                         Each key/value pair is known as an Entry
        //                         FAST insertion, look up, deletion of key/value pairs
        //                         Not ideal for small data sets, great with large data sets
        
        // hashing = Takes a key and computes an integer (formula will vary based on key & data type)
        //                     In a Hashtable, we use the hash % capacity to calculate an index number 
        
        //                      key.hashCode() % capacity = index  
        
        // bucket = an indexed storage location for one or more Entries
        //                  can store multiple Entries in case of a collision (linked similarly a LinkedList)
        
        // collision = hash function generates the same index for more than one key
        //                      less collisions = more efficiency
        
        // Runtime complexity: Best Case O(1)
        //                                     Worst Case O(n)


Collection of <Key,Value> pairs

key.hashCode();
int    -> same value;
String -> (int) ?


