(ns ciderfig.subs
    (:require-macros [reagent.ratom :as ra :refer [reaction]])
    (:require [re-frame.core :as re-frame]))

(re-frame/register-sub
 :name
 (fn [db]
   (reaction (:name @db))))
