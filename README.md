# ciderfig

This is a test project for trying to connect cider to figwheel.

It doesn't work at this point - any help is appreciated.

To start up, do

```
lein figwheel
```

then in emacs

```
M-x cider-connect <Enter> 7888
```

then in the repl

```
(use 'cemerick.piggieback
     'cljs.repl.browser)
  (cljs-repl (repl-env))
```
