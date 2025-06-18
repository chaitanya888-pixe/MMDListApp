package com.sample.presentation.ui.screens;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u001a\u0010\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u00a8\u0006\f"}, d2 = {"ListItem", "", "article", "Lcom/sample/domain/model/NewsInfo;", "onClick", "Lkotlin/Function0;", "ListScreen", "viewModel", "Lcom/sample/presentation/viewmodel/NewsViewModel;", "navController", "Landroidx/navigation/NavController;", "SetImage", "presentation_debug"})
public final class ListScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @android.annotation.SuppressLint(value = {"UnusedMaterial3ScaffoldPaddingParameter"})
    @androidx.compose.runtime.Composable()
    public static final void ListScreen(@org.jetbrains.annotations.NotNull()
    com.sample.presentation.viewmodel.NewsViewModel viewModel, @org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController navController) {
    }
    
    /**
     * Prepare the compose list item screen
     */
    @androidx.compose.runtime.Composable()
    public static final void ListItem(@org.jetbrains.annotations.NotNull()
    com.sample.domain.model.NewsInfo article, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    /**
     * Set the image data to list item
     */
    @androidx.compose.runtime.Composable()
    private static final void SetImage(com.sample.domain.model.NewsInfo article) {
    }
}