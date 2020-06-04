(ns interop.react-navigation.react-navigation-4x.stack-v1
  (:require [react-navigation-stack :as module]
            [goog.object :as gobject]
            [interop.react-navigation.react-navigation-4x.utils-v1 :as utils]))

(assert module)

; stack
(defn create-stack-navigator [r c] (module/createStackNavigator (utils/map->js r :keyword-fn str) (clj->js c)))

;(def Assets module/Assets)
;(def Header module/Header)
;(def HeaderBackButton module/HeaderBackButton)
;(def HeaderBackButtonProps module/HeaderBackButtonProps)
;(def HeaderProps module/HeaderProps)
;(def HeaderStyleInterpolator module/HeaderStyleInterpolator)
;(def HeaderTitle module/HeaderTitle)
;(def NavigationStackConfig module/NavigationStackConfig)
;(def NavigationStackOptions module/NavigationStackOptions)
;(def NavigationStackProp module/NavigationStackProp)
;(def NavigationStackScreenComponent module/NavigationStackScreenComponent)
;(def NavigationStackScreenProps module/NavigationStackScreenProps)
;(def NavigationStackState module/NavigationStackState)
;(def ScenesReducer module/ScenesReducer)
;(def StackGestureContext module/StackGestureContext)
;(def StackGestureContext module/StackGestureContext)
;(def StackView module/StackView)
;(def StackViewCard module/StackViewCard)
;(def StackViewLayout module/StackViewLayout)
;(def StackViewStyleInterpolator module/StackViewStyleInterpolator)
;(def StackViewTransitionConfigs module/StackViewTransitionConfigs)
;(def Transitioner module/Transitioner)
;(def createPointerEventsContainer module/createPointerEventsContainer)