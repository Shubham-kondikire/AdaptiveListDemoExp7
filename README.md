# Experiment 7 — Adaptive Android Application using ListView and ImageView

**Name:** Shubham Shivaji Kondikire
**USN / Registration No.:** 25MCAR0102
**Course:** MCA (General), Jain (Deemed to be University), Bangalore

---

## 1. Aim
To develop an Android application that displays an adaptive list of items using
`ListView` and `ImageView`, where each row is generated dynamically from a data
source through a custom adapter.

## 2. Concept / Technology Used

| Concept | Explanation |
|---|---|
| **ListView** | An Android view that displays a vertically scrollable list of items. Unlike a fixed set of static views, it renders only what's on screen and recycles views as the user scrolls — making it memory-efficient for large data sets. |
| **Adapter pattern** | A `ListView` never talks to data directly; an **Adapter** sits between the data source and the view, converting ("adapting") each data object into a row `View`. This project uses a custom `BaseAdapter` (`CustomAdapter`) instead of a built-in `ArrayAdapter`, because each row needs multiple views (image + 3 text fields), not just plain text. |
| **ImageView** | Displays an image — here, a vector drawable icon per list item — inside each row. |
| **ViewHolder pattern** | Inside `getView()`, the adapter reuses (`convertView`) row layouts instead of inflating a new one every time, and caches child-view references in a `ViewHolder` object via `setTag()`/`getTag()`. This avoids repeated `findViewById()` calls and keeps scrolling smooth. |
| **CardView** | Each row is wrapped in a `CardView` for elevation/rounded corners, giving the list a modern Material Design look instead of plain flat rows. |

## 3. Scenario Used

The app simulates a small **"Fruit Catalog"** — a list of 6 fruits, each shown with:
- an icon (`ImageView`, from a vector drawable),
- a title (fruit name),
- a subtitle (short description),
- a price.

Tapping any row shows a `Toast` confirming the selection, demonstrating that the
`ListView` is not just static display but responds to user interaction via
`setOnItemClickListener()`. A footer bar showing the student's name and USN is
displayed at the bottom of the screen (see Test Case 3).

The scenario deliberately uses a data set (`List<ListItem>`) that can grow or
shrink freely — adding a 7th, 8th, or 20th fruit requires **zero** changes to the
layout or adapter code, which is the core proof that the list is "adaptive."

## 4. Folder / File Structure

```
AdaptiveListDemo/
├── build.gradle                        — project-level Gradle config
├── settings.gradle                     — module registration
├── gradle.properties                   — AndroidX flags
├── README.md                           — this file
└── app/
    ├── build.gradle                    — app module Gradle config (SDK versions, dependencies)
    └── src/main/
        ├── AndroidManifest.xml         — declares MainActivity as launcher activity
        ├── java/com/example/adaptivelistdemo/
        │   ├── MainActivity.java       — builds the data list, attaches adapter, handles clicks
        │   ├── CustomAdapter.java      — BaseAdapter: binds ListItem objects to list_item_row.xml
        │   └── ListItem.java           — POJO model: image resource id, title, subtitle, price
        └── res/
            ├── layout/
            │   ├── activity_main.xml   — Toolbar + ListView + footer TextView
            │   └── list_item_row.xml   — per-row CardView: ImageView + 3 TextViews
            ├── drawable/
            │   ├── ic_apple.xml, ic_banana.xml, ic_grape.xml,
            │   │   ic_mango.xml, ic_orange.xml, ic_watermelon.xml   — vector fruit icons
            │   └── ic_launcher_foreground.xml / ic_launcher_background.xml
            ├── mipmap-anydpi-v26/ic_launcher.xml   — adaptive app icon
            └── values/
                ├── colors.xml          — app color palette
                ├── strings.xml         — app name, toolbar title
                └── styles.xml          — Material theme
```

## 5. Procedure

1. Create a new Android Studio project with an Empty Activity.
2. Design `activity_main.xml` with a `Toolbar` and a `ListView`.
3. Design `list_item_row.xml` — a `CardView` row containing an `ImageView` and
   text fields.
4. Create `ListItem.java` as the data model.
5. Create `CustomAdapter.java` extending `BaseAdapter`; override `getCount()`,
   `getItem()`, `getItemId()`, and `getView()` — the last one inflates the row
   layout (or reuses `convertView`) and binds each `ListItem`'s fields to the
   row's views.
6. In `MainActivity.java`, build a `List<ListItem>` of sample data, create the
   adapter, and call `listView.setAdapter(adapter)`.
7. Add a click listener on the `ListView` to show a `Toast` with the tapped
   item's name.
8. Run the app on an emulator/device, verify the list renders correctly with
   images, and test tapping different rows.

## 6. Output Screenshot

*(Insert screenshot here — full app screen showing the Fruit Catalog list with
icons, titles, subtitles, prices, and the footer bar.)*

`screenshots/output.png`

## 7. Test Cases

| # | Test Case | Steps | Expected Result | Screenshot |
|---|---|---|---|---|
| 1 | App launch & list render | Launch the app | ListView displays all 6 fruits, each with icon, title, subtitle, price | `screenshots/test_case_1_launch.png` |
| 2 | Item click interaction | Tap on any fruit row (e.g., "Mango") | A dialog opens showing the enlarged image and name of the tapped fruit | `screenshots/test_case_2_click.png` |
| 3 | Footer shows USN & name | Launch the app and observe the bottom bar | Footer displays "Shubham Shivaji Kondikire \| USN: 25MCAR0102 \| Experiment 7" | `screenshots/test_case_3_usn.png` |

*(Add the three screenshot files above into a `screenshots/` folder in the repo
before pushing, then the table images will render on GitHub.)*

## 8. Result

The application was successfully executed. The `ListView` correctly displayed
each fruit item with its image and details, adapted its content dynamically
based on the underlying data list, and responded correctly to user taps.

## 9. Conclusion

Thus, an Android application using `ListView` and `ImageView` bound through a
custom `BaseAdapter` was designed and implemented successfully, demonstrating
how the Adapter design pattern connects a dynamic data source to a scrollable
UI list in Android.

## 10. How to Run

1. Clone this repository.
2. Open the `AdaptiveListDemo` folder in Android Studio.
3. Let Gradle sync (min SDK 21, target SDK 34).
4. Run on an emulator or physical device (▶ Run 'app').
