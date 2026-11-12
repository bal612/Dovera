# Dovera — Foundation Roadmap

> Working branch: `dovera/brand-identity-pass`. Do not commit to or modify `main` during this foundation phase.

## Product decision

Dovera is its own Android-first messaging product. The project may reuse selected, audited source code and libraries from the SimpleX Chat codebase, but Dovera must have its own product identity, application experience, release process, and roadmap.

The supplied Dovera welcome-screen image is the visual reference for the Android entry experience:
- Official blue-and-silver bird emblem and DOVERA wordmark.
- Arabic tagline: `تواصل .. مشاركة .. معرفة`.
- Supporting statement: `من أجل عالم أكثر تواصلاً ومجتمع أكثر معرفة`.
- Primary actions: `دخول إلى دوفيرا` and `إنشاء حساب جديد`.
- Footer: `Dovera من kalimat`.

## Technical direction

1. Keep Android as the first delivery target.
2. Reuse the existing Android/Kotlin Multiplatform build and native messaging engine only after mapping their boundaries and licenses.
3. Separate Dovera-owned UI, branding, navigation, and product configuration from the reused messaging/core components.
4. Do not rewrite cryptography. Use established, reviewed cryptographic implementations and preserve their security properties.
5. Do not describe Dovera as an independently implemented messaging protocol or independent relay network until those components have actually been designed, implemented, and tested.
6. Treat upstream SimpleX updates as deliberate, reviewed imports. No automatic upstream merge or asset/name replacement is part of this roadmap.

## Repository and branch safeguards

- Active repository: `bal612/Dovera`.
- Active working branch for the current transition: `dovera/brand-identity-pass`.
- `main` is out of scope and must not be modified.
- Keep each meaningful change in a small, reviewable commit on the working branch.
- Do not publish a final release from a tag that does not point to the exact commit used to build the APK.

## First implementation gates

### Gate 1 — Source and license audit
- Identify the Android entry point, shared Compose UI, core API/FFI boundary, native libraries, and build inputs.
- Record upstream origin/version for reused components.
- Preserve AGPL-3.0 and all third-party notices; verify distribution and network-use obligations before release.

### Gate 2 — Dovera Android shell
- Implement the supplied welcome-screen design using Dovera-owned resources and strings.
- Verify launcher/adaptive icons, splash, app label, package/application ID, notifications, and About screen.
- Keep the messaging engine unchanged while the new shell is validated.

### Gate 3 — Messaging integration
- Connect the Dovera UI to the existing messaging/core API through a narrow adapter.
- Verify account creation, secure key storage, one-to-one messaging, attachments, and recovery on test devices.
- Do not claim end-to-end security independently audited by Dovera; document the exact reused security components.

### Gate 4 — Release verification
- Build debug and signed release APKs for supported Android ABIs.
- Verify package ID, signing certificate, APK integrity, installed appearance, and core messaging flows.
- Publish release assets only when the release tag points to the exact tested source commit.

## Current baseline observation

The working branch currently contains a substantial SimpleX-derived Kotlin Multiplatform Android client and native core, with Dovera branding changes layered onto it. This roadmap does not claim that the UI, protocol, or relay infrastructure has already become independent; those boundaries must be established incrementally and verified.
