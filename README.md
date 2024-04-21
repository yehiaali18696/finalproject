### Code Documentation

#### Classes

1. **DoubleRoom**:
   - Inherits from `SingleRoom`.
   - Attributes:
     - `name2`: Second customer's name.
     - `contact2`: Second customer's contact information.
     - `gender2`: Second customer's gender.
   - Constructors:
     - Default constructor initializes attributes to empty strings.
     - Parameterized constructor initializes all attributes including those inherited from `SingleRoom`.
   - Methods:
     - `ChangeFirstName(String newName)`: Changes the first customer's name.
     - `ChangeFirstGender(String newGender)`: Changes the first customer's gender.

2. **Food**:
   - Implements `Serializable`.
   - Attributes:
     - `itemNo`: Item number.
     - `quantity`: Quantity of the item.
     - `cost`: Cost of the item.
   - Constructor:
     - Initializes `cost` based on `itemNo` and `quantity`.

3. **Holder**:
   - Implements `Serializable`.
   - Attributes:
     - `arr1`: Array of `DoubleRoom` objects for luxury rooms.
     - `arr2`: Array of `DoubleRoom` objects for deluxe rooms.
     - `arr3`: Array of `SingleRoom` objects for luxury rooms.
     - `arr4`: Array of `SingleRoom` objects for deluxe rooms.

4. **Hotel**:
   - Provides methods to interact with the hotel system.
   - Static methods:
     - `CustDetails(int i, int rn)`: Collects customer details based on room type.
     - `bookroom(int i)`: Books a room based on room type.
     - `features(int i)`: Displays features of a given room type.
     - `availability(int i)`: Displays availability of rooms for a given room type.
     - `bill(int rn, int rtype)`: Generates bill for a given room and room type.
     - `deallocate(int rn, int rtype)`: Deallocates a booked room for a given room and room type.
     - `order(int rn, int rtype)`: Places food order for a booked room and room type.

5. **Main**:
   - Contains the main method to run the hotel management system.
   - Allows users to interact with the system by choosing various options.

6. **NotAvailable**:
   - Custom exception class indicating room is not available.

7. **SingleRoom**:
   - Implements `Serializable` and `roomMaintance`.
   - Attributes:
     - `name`: Customer name.
     - `contact`: Customer contact information.
     - `gender`: Customer gender.
     - `food`: ArrayList of `Food` objects for ordered food items.
   - Constructors:
     - Default constructor initializes `name` to an empty string.
     - Parameterized constructor initializes all attributes.
   - Methods:
     - `ChangeFirstName(String newName)`: Changes the customer's name.
     - `ChangeFirstGender(String newGender)`: Changes the customer's gender.

#### Interfaces

1. **roomMaintance**:
   - Declares methods for changing customer's name and gender.

#### Serializable
- Classes `DoubleRoom`, `Food`, `Holder`, `SingleRoom`, and `Main` implement `Serializable` to support object serialization.

#### Inheritance
- `DoubleRoom` inherits from `SingleRoom`.

#### Collection
- `SingleRoom` class uses an ArrayList to store food items.

### Additional Notes
- The system provides functionalities for booking rooms, ordering food, checking availability, and generating bills.
- It uses exception handling for cases where rooms are not available.
- The `roomMaintance` interface ensures a consistent method for changing customer information across room types.
