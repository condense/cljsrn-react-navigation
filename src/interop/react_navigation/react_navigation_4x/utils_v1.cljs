(ns interop.react-navigation.react-navigation-4x.utils-v1
  (:require [goog.object :as gobject]))

(defn map->js [m & {:keys [keyword-fn] :or {keyword-fn name}}]
  (let [o (js-obj)]
    (doseq [[k v] m] (gobject/set o (keyword-fn k) v))
    o))