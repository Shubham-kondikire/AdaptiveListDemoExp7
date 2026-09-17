# Experiment 7: Adaptive Android Application using ListView and ImageView

## Adaptive Fruit Catalog Application

### Student Details

**Name:** Shubham Shivaji Kondikire
**USN:** 25MCAR0102
**Experiment No.:** 7
**Course:** MCA (General), Jain (Deemed to be University), Bangalore

---

# Aim

To develop an Android application that displays an adaptive list of items using `ListView` and `ImageView`, where each row is generated dynamically from a data source using a custom adapter.

---

# Objective

The objective of this experiment is to understand and implement the `ListView` and `ImageView` components in Android and learn how a custom adapter connects a dynamic data source with the user interface.

The application demonstrates the use of:

* ListView
* ImageView
* BaseAdapter
* Custom Adapter
* ViewHolder Pattern
* CardView
* XML Layouts
* Dynamic Data
* Toast Messages
* Item Click Listener
* Vector Drawables

---

# Concept / Technology Used

## ListView

`ListView` is an Android UI component used to display a vertically scrollable list of items.

It allows multiple items to be displayed in a single screen and supports scrolling when the number of items is larger than the available screen space.

In this application, `ListView` is used to display the fruit catalog.

---

## ImageView

`ImageView` is an Android UI component used to display images.

In this application, an `ImageView` is included in every list row to display the corresponding fruit icon.

The application uses vector drawable icons for the fruits.

---

## Adapter

An Adapter acts as a bridge between the data source and the UI component.

The `ListView` does not directly display the data. Instead, the custom adapter converts every `ListItem` object into an individual row view.

This application uses a custom `BaseAdapter` named `CustomAdapter`.

---

## CustomAdapter

`CustomAdapter` extends the Android `BaseAdapter` class.

It is responsible for:

* Getting the number of items.
* Getting individual data items.
* Creating or reusing row views.
* Setting fruit images.
* Setting fruit names.
* Setting fruit descriptions.
* Setting fruit prices.

The adapter allows the application to display dynamic data without changing the XML layout.

---

## ViewHolder Pattern

The ViewHolder pattern is used to improve the performance of the `ListView`.

Instead of repeatedly calling `findViewById()`, references to the row's views are stored inside a `ViewHolder` object.

The ViewHolder is attached to the recycled row using:

```java
setTag()
```

and retrieved using:

```java
getTag()
```

This reduces unnecessary view lookups and provides smoother scrolling.

---

## CardView

`CardView` is used as the container for each fruit item.

It provides:

* Rounded corners
* Elevation
* Better visual separation
* Modern card-style appearance

Each fruit is displayed inside a separate card.

---

## Vector Drawable

Vector drawable resources are used to represent the fruit images.

The application contains vector icons for:

* Apple
* Banana
* Grape
* Mango
* Orange
* Watermelon

---

# Scenario

The application simulates a small **Fruit Catalog**.

The Fruit Catalog contains six different fruits.

Each fruit item displays:

1. Fruit Image
2. Fruit Name
3. Fruit Description
4. Fruit Price

The application also supports user interaction.

When the user taps a fruit item, a message is displayed confirming the selected fruit.

The data is stored using a list of `ListItem` objects.

The main advantage of using a dynamic list is that additional fruits can be added without changing the layout structure.

For example, adding a seventh, eighth, or twentieth fruit only requires adding data to the list.

---

# Application Features

The application provides the following features:

* Displays a list of fruits.
* Displays an image for every fruit.
* Displays the fruit name.
* Displays a short description.
* Displays the fruit price.
* Supports vertical scrolling.
* Uses a custom adapter.
* Uses ViewHolder for efficient row reuse.
* Uses CardView for each item.
* Responds to item clicks.
* Displays a Toast message when an item is selected.
* Supports dynamic addition of list items.

---

# Application Flow

```text
                    MainActivity
                         |
                         ↓
                Create Fruit List
                         |
                         ↓
                  List<ListItem>
                         |
                         ↓
                  CustomAdapter
                         |
                         ↓
                 listView.setAdapter()
                         |
                         ↓
                  Display ListView
                         |
                         ↓
             Fruit Card / List Row
                         |
              ┌──────────┼──────────┐
              ↓          ↓          ↓
           Image       Details     Price
              |
              ↓
          User Clicks
              |
              ↓
       OnItemClickListener
              |
              ↓
         Show Toast Message
```

---

# Software Requirements

* Android Studio
* Java
* Android SDK
* Gradle
* Android Emulator or Physical Android Device

---

# Hardware Requirements

* Laptop/Desktop
* Android Device or Android Emulator
* USB Cable, if using a physical Android device

---

# Technologies Used

| Technology / Component | Purpose                         |
| ---------------------- | ------------------------------- |
| Java                   | Application logic               |
| XML                    | User interface design           |
| ListView               | Displaying the fruit list       |
| ImageView              | Displaying fruit images         |
| BaseAdapter            | Creating custom adapter         |
| CustomAdapter          | Connecting data with ListView   |
| ListItem               | Data model                      |
| ViewHolder             | Efficient view recycling        |
| CardView               | Card-style list items           |
| Vector Drawable        | Fruit icons                     |
| Toast                  | Displaying selection messages   |
| Android Manifest       | Application configuration       |
| Gradle                 | Build and dependency management |

---

# Project Folder and File Structure

```text
AdaptiveListDemo/
│
├── app/
│   │
│   ├── src/
│   │   │
│   │   └── main/
│   │       │
│   │       ├── java/
│   │       │   └── com/example/adaptivelistdemo/
│   │       │       ├── MainActivity.java
│   │       │       ├── CustomAdapter.java
│   │       │       └── ListItem.java
│   │       │
│   │       ├── res/
│   │       │   ├── drawable/
│   │       │   │   ├── ic_apple.xml
│   │       │   │   ├── ic_banana.xml
│   │       │   │   ├── ic_grape.xml
│   │       │   │   ├── ic_mango.xml
│   │       │   │   ├── ic_orange.xml
│   │       │   │   └── ic_watermelon.xml
│   │       │   │
│   │       │   ├── layout/
│   │       │   │   ├── activity_main.xml
│   │       │   │   └── list_item_row.xml
│   │       │   │
│   │       │   ├── mipmap-anydpi-v26/
│   │       │   │   └── ic_launcher.xml
│   │       │   │
│   │       │   └── values/
│   │       │       ├── colors.xml
│   │       │       ├── strings.xml
│   │       │       └── styles.xml
│   │       │
│   │       └── AndroidManifest.xml
│   │
│   └── build.gradle
│
├── build.gradle
├── gradle.properties
├── settings.gradle
├── gradlew
├── gradlew.bat
└── README.md
```

The project structure and file responsibilities are based on the Experiment 7 project documentation.

---

# Important Files and Their Purpose

## MainActivity.java

`MainActivity.java` contains the main application logic.

It is responsible for:

* Creating the fruit data list.
* Creating `ListItem` objects.
* Creating the `CustomAdapter`.
* Connecting the adapter with the ListView.
* Handling item click events.
* Displaying Toast messages.

The main activity acts as the starting point of the application.

---

## CustomAdapter.java

`CustomAdapter.java` is a custom adapter that extends `BaseAdapter`.

It connects the `ListItem` data with the `ListView`.

The adapter is responsible for:

* Returning the number of items.
* Returning individual items.
* Creating list rows.
* Reusing existing rows.
* Setting ImageView resources.
* Setting fruit names.
* Setting descriptions.
* Setting prices.

---

## ListItem.java

`ListItem.java` is the model class used to store information about each fruit.

Each object contains information such as:

```text
Image Resource
Fruit Name
Fruit Description
Fruit Price
```

The objects are stored inside a `List<ListItem>`.

---

## activity_main.xml

`activity_main.xml` defines the main application interface.

It contains:

* Toolbar
* ListView
* Footer TextView

The ListView is responsible for displaying the fruit catalog.

---

## list_item_row.xml

`list_item_row.xml` defines the layout of an individual fruit item.

Each row contains:

* CardView
* ImageView
* Fruit Name TextView
* Description TextView
* Price TextView

The same row layout is reused for every fruit.

---

## AndroidManifest.xml

`AndroidManifest.xml` contains the application configuration.

It declares the application and identifies `MainActivity` as the launcher activity.

---

## build.gradle

`build.gradle` contains the Android application build configuration.

It manages:

* SDK configuration
* Application configuration
* Dependencies
* Build settings

---

# Working / Implementation

## 1. Create the Data Model

A `ListItem` class is created to represent a fruit.

Each fruit object stores:

```text
Image
Title
Subtitle
Price
```

Example:

```java
ListItem mango = new ListItem(
        R.drawable.ic_mango,
        "Mango",
        "Fresh and juicy mango",
        "₹120"
);
```

---

## 2. Create the Fruit List

A dynamic list is created in `MainActivity`.

```java
List<ListItem> fruitList = new ArrayList<>();
```

Fruit objects are then added to the list.

```text
Apple
Banana
Grape
Mango
Orange
Watermelon
```

The number of items can be increased or decreased without changing the row layout.

---

## 3. Create Custom Adapter

The application creates an instance of `CustomAdapter`.

```java
CustomAdapter adapter =
        new CustomAdapter(this, fruitList);
```

The adapter receives the fruit list and the current context.

---

## 4. Attach Adapter to ListView

The adapter is connected to the ListView.

```java
listView.setAdapter(adapter);
```

The ListView then requests rows from the adapter.

---

## 5. Create and Reuse Rows

Inside `getView()`, the adapter checks whether an existing row can be reused.

The ViewHolder pattern is used to store references to the row views.

The adapter then sets the appropriate:

* Image
* Name
* Description
* Price

for every fruit.

---

## 6. Handle Item Click

An `OnItemClickListener` is added to the ListView.

When the user taps a fruit, the selected item's information can be displayed using a Toast message.

Example:

```java
listView.setOnItemClickListener((parent, view, position, id) -> {

    ListItem item = fruitList.get(position);

    Toast.makeText(
            this,
            "Selected: " + item.getTitle(),
            Toast.LENGTH_SHORT
    ).show();
});
```

---

# Adaptive List Concept

The main purpose of this experiment is to demonstrate an adaptive list.

The application does not create a separate XML layout for every fruit.

Instead, a single row layout is reused.

For example:

```text
list_item_row.xml
        |
        ↓
     Apple
        |
        ↓
     Banana
        |
        ↓
     Grape
        |
        ↓
     Mango
        |
        ↓
     Orange
        |
        ↓
   Watermelon
```

The same layout is dynamically populated with different data.

Therefore, adding more items does not require creating additional layouts.

---

# ListView and Adapter Relationship

```text
             Data Source
                  |
                  ↓
          List<ListItem>
                  |
                  ↓
           CustomAdapter
                  |
                  ↓
             getView()
                  |
                  ↓
            Row Layout
                  |
        ┌─────────┼─────────┐
        ↓         ↓         ↓
     Image      Text      Price
        |
        ↓
      ListView
```

The adapter acts as a bridge between the data source and the ListView.

---

# Test Cases

## Test Case 1: App Launch and List Display

### Test Objective

To verify that the application successfully displays the fruit list when the application is launched.

### Test Steps

1. Open the Android application.
2. Wait for the application to load.
3. Observe the Fruit Catalog.
4. Scroll through the list.

### Expected Result

The ListView should display all six fruit items with:

* Fruit image
* Fruit name
* Description
* Price

### Actual Result

The fruit list was displayed successfully with the required information.

### Status

**PASS ✅**

---

# Test Case 2: Item Click Interaction

### Test Objective

To verify that the application responds when the user selects a fruit item.

### Test Steps

1. Launch the application.
2. Locate any fruit.
3. Tap on the fruit row.
4. Observe the message displayed.

### Expected Result

A Toast message should appear confirming the selected fruit.

Example:

```text
Selected: Mango
```

### Actual Result

The Toast message appeared successfully after selecting the fruit.

### Status

**PASS ✅**

---

# Test Case 3: Footer Shows Student Information

### Test Objective

To verify that the footer displays the student's information.

### Test Steps

1. Launch the application.
2. Scroll to or observe the bottom section.
3. Check the footer information.

### Expected Result

The footer should display:

```text
Shubham Shivaji Kondikire | USN: 25MCAR0102 | Experiment 7
```

### Actual Result

The student name, USN, and experiment information were displayed successfully.

### Status

**PASS ✅**

---

# Output

The application successfully demonstrates an adaptive Fruit Catalog using Android `ListView` and `ImageView`.

The application displays six fruits dynamically.

Each item contains:

* Image
* Fruit name
* Description
* Price

The ListView supports scrolling and user interaction.

---

# Output Screenshots

<img width="720" height="1600" alt="exp7 png" src="https://github.com/user-attachments/assets/1a2b71ad-ec77-49e6-95c6-50666adb29dd" />
<img width="720" height="1600" alt="exp7 png (2)" src="https://github.com/user-attachments/assets/3ca464d9-42e0-4a3f-b727-2fd8a7f33bdb" />



Recommended structure:

```text
screenshots/
│
├── output.png
├── test_case_1_launch.png
├── test_case_2_click.png
└── test_case_3_usn.png
```

### Main Application

![Experiment 7 Output](screenshots/output.png)

### Test Case 1 — List Display

![Test Case 1](screenshots/test_case_1_launch.png)

### Test Case 2 — Item Click

![Test Case 2](screenshots/test_case_2_click.png)

### Test Case 3 — Student Information

![Test Case 3](screenshots/test_case_3_usn.png)

---

# Steps to Run the Project

## Step 1: Open the Project

Open **Android Studio**.

Select:

```text
File → Open
```

Choose the `AdaptiveListDemo` project folder.

---

## Step 2: Gradle Synchronization

Allow Android Studio to complete the Gradle synchronization.

Make sure there are no Gradle or dependency errors.

---

## Step 3: Connect Device

You can use either:

* Android Emulator
* Physical Android Device

If using a physical Android device:

1. Enable Developer Options.
2. Enable USB Debugging.
3. Connect the device using a USB cable.

---

## Step 4: Run the Application

Select the application from the Run Configuration.

Click:

```text
Run ▶
```

The application will be installed and launched on the selected device.

---

## Step 5: Test the Application

After launching the application:

1. Observe the Fruit Catalog.
2. Scroll through the list.
3. Check the fruit images.
4. Check the fruit names.
5. Check the descriptions.
6. Check the prices.
7. Tap any fruit.
8. Verify the Toast message.
9. Check the footer information.

---

# Learning Outcomes

After completing this experiment, the following concepts were understood:

* ListView
* ImageView
* Adapter Pattern
* BaseAdapter
* Custom Adapter
* ViewHolder Pattern
* Dynamic data handling
* XML-based Android layouts
* CardView
* Vector Drawables
* List item recycling
* Item click handling
* Toast messages
* Dynamic list generation
* Android project structure

---

# Result

The Android application was successfully developed and executed using `ListView` and `ImageView`.

The application successfully displays fruit items dynamically using a custom `BaseAdapter`.

The application also responds to user interaction when a fruit item is selected.

---

# Conclusion

The experiment successfully demonstrated the implementation of an adaptive Android application using **ListView and ImageView**.

A custom `BaseAdapter` was used to connect the dynamic fruit data with the ListView.

The application demonstrated important Android concepts such as **ListView, ImageView, Adapter Pattern, ViewHolder Pattern, CardView, dynamic data, XML layouts, and item click handling**.

The use of a reusable row layout makes it possible to display a different number of items without creating separate layouts for every item.

Thus, the objective of developing an adaptive Android application using ListView and ImageView was successfully achieved.

---

# Student Information

**Name:** Shubham Shivaji Kondikire
**USN:** 25MCAR0102
**Course:** MCA (General)
**Experiment:** 7
**Application:** AdaptiveListDemo
**University:** Jain (Deemed to be University), Bangalore

---

# GitHub Repository

**Repository Name:** AdaptiveListDemo

**GitHub:** Shubham-kondikire/AdaptiveListDemo

---

# References

1. Android Developers – ListView
2. Android Developers – ImageView
3. Android Developers – Adapter
4. Android Developers – BaseAdapter
5. Android Developers – CardView
6. Android Developers – Android User Interface and Layouts

---

# Author

**Shubham Shivaji Kondikire**

**USN:** 25MCAR0102

**MCA (General)**
**Jain (Deemed to be University), Bangalore**
