## Hash Tables

- Made up of a hash fx and an array.
- Can be used to model relationships
- Creates a mapping from one item to another.
- Duplicates will overwrite any already existing values.
- DNS Resolution - one application of hashing.
- Must be consistent:
  - If a key once you should get value x
  - If a key again, you should get the same value x
- Must avoid collisions - when the hash value fx output is the same for a different key  
- Hash Tables choose where to store certain values. 
  - The hash fx must choose different outputs for different inputs.
- Duplicate keys cause collisions - or as a workaround - LL stored at the key value.
- Reads: O(1) - Constant Time
- Writes: O(1) - Constant Time
- Inserts: O(1) - Constant Time
- Deletes: O(1) - Constant Time