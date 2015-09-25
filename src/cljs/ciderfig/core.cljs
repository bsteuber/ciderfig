(ns ciderfig.core
  (:require [ciderfig.db  :as db]
            [reagent.core :as reagent]))

(defn ^:export init []
  (.log js/console "Hello"))
