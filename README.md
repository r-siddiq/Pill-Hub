# PillHub – Prescription & Inventory Manager

PillHub is an Android application designed to streamline prescription and drug inventory management. It provides a clean interface for users, pharmacies, and administrators to manage medications efficiently while leveraging modern Android development practices.

---

## 🚀 Features
- **User Authentication** – Secure login and signup functionality.
- **Prescription Management** – Add, update, and view prescriptions.
- **Inventory Tracking** – Manage drug stock levels in pharmacies.
- **Role-based Access** – User and Admin functionalities.
- **Modern Android Architecture** – MVVM pattern with Room persistence.
- **UI Components** – RecyclerView with adapters and custom view holders.
- **Testing Suite** – Unit and instrumentation tests for entities, DAOs, and activities.

---

## 🛠️ Tech & Build
- **Language**: Java
- **Android Gradle Plugin (AGP)**: defined in `gradle/libs.versions.toml`
- **Compile/Target SDK**: 34
- **Min SDK**: 26
- **Package**: `com.pillhub`

> Core Gradle files are included and configured for Android Studio and CI-friendly builds:
>
> - `settings.gradle` – plugin management and project inclusion
> - `build.gradle` (root) – applies Android application plugin via version catalogs
> - `app/build.gradle` – app module config (applicationId, SDK versions, dependencies)
> - `gradle/` – version catalogs (`libs.versions.toml`) & wrapper config
> - `gradlew`, `gradlew.bat`, `gradle/wrapper/*` – Gradle wrapper for reproducible builds
> - `gradle.properties` – JVM/Gradle flags
> - `.gitignore` – excludes `build/`, `.gradle/`, `local.properties`, APKs, keystores, etc.

---

## 📂 Project Structure
- **Activities** – UI screens (`LoginActivity`, `InventoryActivity`, `PrescriptionEntryActivity`, etc.)
- **Database** – Room implementation with DAOs, Entities, Repository, and Converters.
- **Adapters & ViewHolders** – RecyclerView components for dynamic UI.
- **Resources** – XML layouts, drawables, menus, themes.
- **Tests** – Unit and instrumentation tests covering DAO, database, and entity logic.

---

## 🧪 Testing
- `androidTest/` – Integration tests for database and DAO operations.
- `test/` – Unit tests for entities and business logic.

---

## 🏗️ Build & Run

### Android Studio (recommended)
1. Open **Android Studio** → **Open** → select this project root.
2. Use **Gradle JDK 17+** (AGP 8.x requires JDK 17).
3. Let Gradle sync finish, then **Run ▶** the *app* configuration on an emulator/device.

### Command line
```bash
# from the repo root
./gradlew clean assembleDebug
./gradlew testDebugUnitTest
./gradlew connectedDebugAndroidTest   # instrumentation tests (requires emulator/device)
```

---

## 🧪 Testing
- **Unit tests**: `app/src/test/java/com/pillhub/` (e.g., `PrescriptionTest`, `UserTest`)
- **Instrumentation tests**: `app/src/androidTest/java/com/pillhub/` (e.g., `DrugDaoTest`, `PharmacyDatabaseTest`)

Run tests via Android Studio’s test gutter icons or Gradle tasks shown above.

---

## 🧱 Architecture
- **Activities** drive screens: `LoginActivity`, `SignUpActivity`, `InventoryActivity`, `PrescriptionEntryActivity`, `UserPrescriptionActivity`, etc.
- **Room** layer under `Database/`:
    - Entities: `Drug`, `Prescription`, `User`
    - DAOs: `DrugDAO`, `PrescriptionDAO`, `UserDAO`
    - Database: `PharmacyDatabase`
    - Repository: `PharmacyRepository`
    - Converters: `Converters`, `LocalDateTypeConverter`
- **UI lists**: RecyclerView with `PrescriptionAdapter` and `PrescriptionViewHolder`.

---

## 📌 Notable Implementation Details
- **TypeConverters** enable storage of Java time-like types.
- **RecyclerView** patterns for editable, scrollable lists.
- **Version Catalogs** (`libs.versions.toml`) pin plugin and library versions (AGP {"8.5.1"}, AppCompat, Material, Activity, ConstraintLayout, AndroidX Test).

---

## 👤 Authors
**Rahim Siddiq**, **Gary Keupper**, **Jess Hammond**, **Saria Kabbour**
- This project showcases Android fundamentals: persistence, UI architecture, and testing.
