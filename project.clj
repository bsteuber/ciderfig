(defproject ciderfig "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.122" :scope "provided"]
                 [com.cemerick/piggieback "0.2.1"]
                 [reagent "0.5.0"]
                 [re-frame "0.4.1"]]

  :source-paths ["src/clj"]

  :plugins [[lein-cljsbuild "1.1.0"]
            [refactor-nrepl "2.0.0-SNAPSHOT"]
            [lein-figwheel "0.4.0" :exclusions [cider/cider-nrepl]]
            [cider/cider-nrepl "0.10.0-SNAPSHOT"]]

  :clean-targets ^{:protect false} ["resources/public/js/compiled" "target"  ]

  :figwheel {:nrepl-port 7888
             :nrepl-middleware ["cider.nrepl/cider-middleware"
                                "refactor-nrepl.middleware/wrap-refactor"
                                "cemerick.piggieback/wrap-cljs-repl"]
             :repl false}

  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src/cljs"]
                        :figwheel {:on-jsload "ciderfig.core/mount-root"}
                        :compiler {:main ciderfig.core
                                   :output-to "resources/public/js/compiled/app.js"
                                   :output-dir "resources/public/js/compiled/out"
                                   :asset-path "js/compiled/out"
                                   :source-map-timestamp true}}]})
