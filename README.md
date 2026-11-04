# Dovera

**Dovera** is a privacy-focused messaging application. This repository contains the Android and multiplatform application source, build configuration, and project documentation.

## Project

Dovera is developed as its own product identity. The application name, visual identity, user-facing content, and future interface work are maintained for Dovera.

## Build

The Android release workflow builds the FOSS release variant and signs the APK using the repository's configured release credentials. Do not publish signing credentials or keystore files.

## Open-source acknowledgements and licenses

With thanks to the SimpleX Chat project and its contributors for the open-source messaging components that form part of Dovera's current technical foundation.

This repository contains modified source code derived from the SimpleX Chat project. The applicable source license is **GNU Affero General Public License v3.0 (AGPL-3.0)**; see [LICENSE](./LICENSE). Copyright notices, license texts, and notices for third-party components must remain with the corresponding code and distributions. Each dependency may have additional license terms.

The Dovera name and visual identity are separate project branding. This acknowledgement does not imply endorsement by, or affiliation with, the upstream project. The upstream project's trademarks and original artwork are not transferred by the software license.

## Disclaimer

The software is provided without warranty, as permitted by the applicable licenses. Recipients may exercise the rights granted by those licenses and should consult [LICENSE](./LICENSE) and the relevant third-party notices for the complete terms.

## Project source

- Android application: `apps/multiplatform/android`
- Shared application code: `apps/multiplatform/common`
- Release workflow: `.github/workflows/dovera-android-release.yml`
