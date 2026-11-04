# Dovera

**Dovera** is an Android messaging application with its own product identity and user experience.

## Project status

Dovera is currently being customized from an existing open-source messaging codebase. Its Android application ID is `com.dovera.messenger`. The current implementation retains the inherited messaging engine and native components; a fully independent messaging protocol and server infrastructure are not claimed.

## Build

The Android application is built from `apps/multiplatform`:

```bash
./gradlew --no-daemon :android:assembleFossRelease
```

The signed release workflow is `.github/workflows/dovera-android-release.yml`.

## Open-source acknowledgements and licenses

Dovera gratefully acknowledges the upstream **SimpleX Chat** open-source project, whose source code provides the technical foundation for the current messaging implementation. This acknowledgement does not imply endorsement, affiliation, or that Dovera is an official upstream application.

The inherited source code is distributed under the GNU Affero General Public License version 3 (AGPLv3), subject to the terms in [LICENSE](./LICENSE). Third-party libraries and native components may have separate licenses. Their copyright notices, license texts, and required attributions must remain with the relevant distributed components. The upstream project's name, trademarks, and artwork are not transferred by the software license.

## Contributions

Changes to Dovera should preserve the existing license obligations and must not remove third-party notices required for redistribution.
