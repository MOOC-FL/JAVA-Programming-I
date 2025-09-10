#### Changing the implementation of a class
- - We have arrived at a situation where the class 'WordSet' "encapsulates" an ArrayList.
  -  Is this reasonable? Perhaps.
  -  This is because we can make other changes to the class if we so desire,
  -  and before long we might arrive at a situation where the word set has to be,
  -  for example, saved into a file.
- If we make all these changes inside the class WordSet without changing the names of the methods that the user interface uses, we don't have to modify the actual user interface at all
- The main point here is that changes made inside the class WordSet don't affect the class UserInterface. This is because the user interface uses WordSet through the methods that it provides — these are called its public interfaces.


