(ns ciderfig.core
    (:require [reagent.core :as reagent]
              [re-frame.core :as re-frame]
              [ciderfig.handlers :as h]
              [ciderfig.subs :as s]
              [ciderfig.views :as views]
              [ciderfig.db :as db]))

(defn mount-root []
  (reagent/render [views/main-panel]
                  (.getElementById js/document "app")))

(defn ^:export init []
  (.log (js/console) "DB val" db/default-db)
  (re-frame/dispatch-sync [:initialize-db])
  (mount-root))
