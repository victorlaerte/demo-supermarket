package io.wedeploy.supermarket.products.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import io.wedeploy.supermarket.databinding.ItemProductBinding;
import io.wedeploy.supermarket.products.model.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Silvio Santos
 */
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

	@Override
	public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
		LayoutInflater inflater = LayoutInflater.from(parent.getContext());
		ItemProductBinding binding = ItemProductBinding.inflate(inflater, parent, false);

		return new ProductViewHolder(binding);
	}

	@Override
	public void onBindViewHolder(ProductViewHolder holder, int position) {
		Product product = products.get(position);
		holder.binding.setProduct(product);
	}

	@Override
	public int getItemCount() {
		return products.size();
	}

	public void setItems(List<Product> products) {
		this.products.clear();

		if (products != null) {
			this.products.addAll(products);
		}

		notifyDataSetChanged();
	}

	private List<Product> products = new ArrayList<>();

	class ProductViewHolder extends RecyclerView.ViewHolder {

		ItemProductBinding binding;

		public ProductViewHolder(ItemProductBinding binding) {
			super(binding.getRoot());

			this.binding = binding;
		}
	}

}