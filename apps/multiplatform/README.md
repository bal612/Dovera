# Dovera Android development

This directory contains the Kotlin Multiplatform application used by Dovera. Android and desktop share Compose Multiplatform UI and common application logic.

## Modules

- `common/` — shared Compose UI, models, application logic, and platform abstractions.
- `android/` — Android application container, manifest, resources, and native integration.
- `desktop/` — desktop/JVM application container.
- `external/` — external components used by the build.

## Build commands

```bash
# Android debug APK
./gradlew :android:assembleFossDebug

# Android signed/release APK (signing properties are supplied by the release workflow)
./gradlew :android:assembleFossRelease

# Desktop distribution for the current operating system
./gradlew :desktop:packageDistributionForCurrentOS

# Shared tests
./gradlew :common:allTests

# Clean build
./gradlew clean
```

## Architecture

The shared application code is under `common/src/commonMain/`:

- `model/` — application state, messaging models, and API bindings.
- `platform/` — platform-specific interfaces and implementations.
- `views/` — Compose screens grouped by feature.
- `ui/theme/` — color palettes, typography, shapes, and theme management.

The Android client communicates with the inherited native messaging core through JNI/FFI. Native libraries are prepared by the signed release workflow and verified against pinned checksums before packaging.

## Android configuration

- Application ID: `com.dovera.messenger` (keep stable to preserve update compatibility).
- Namespace: `chat.simplex.app` (internal source namespace; changing it requires a separate migration).
- Minimum SDK: 26.
- Target SDK: 35.
- NDK: 23.1.7779620.
- Release flavor: `foss`.

## Branding

User-visible product identity, Android launcher resources, splash presentation, and Compose design elements are maintained as Dovera assets. Do not remove required third-party copyright or license notices. The technical foundation and inherited native components are acknowledged in the repository's root README and the in-app About information.
